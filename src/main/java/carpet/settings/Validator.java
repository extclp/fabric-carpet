package carpet.settings;

import carpet.CarpetSettings;
import carpet.api.settings.CarpetRule;
import carpet.api.settings.Validators;
import carpet.utils.CommandHelper;
import carpet.utils.Messenger;
import net.minecraft.commands.CommandSourceStack;

/**
 * @deprecated Use {@link carpet.api.settings.Validator} instead
 */
@Deprecated(forRemoval = true)
public abstract class Validator<T> extends carpet.api.settings.Validator<T>
{
	{
		// Print deprecation warning once while instantiating the class
	    CarpetSettings.LOG.warn("""
                Validator '%s' is implementing the old Validator class! This class is deprecated and will be removed \
                and crash in later Carpet versions!""".formatted(getClass().getName()));
	}
    /**
     * Validate the new value of a rule
     * @return a value if the given one was valid or could be cleanly adapted, null if new value is invalid.
     */
    @Override
    public final T validate(CommandSourceStack source, CarpetRule<T> changingRule, T newValue, String stringInput) {
        // Compatibility code
        if (!(changingRule instanceof ParsedRule<T> parsedRule))
            // Throwing here is not an issue because Carpet's current implementation only calls validators with ParsedRule.
            // This would be thrown if a different implementation tries to use it, and then it's their issue in multiple ways
            throw new IllegalArgumentException("Passed a non-ParsedRule to a validator using the outdated method!");
        return validate(source, parsedRule, newValue, stringInput);
    }
    /**
     * @deprecated Implement {@link #validate(CommandSourceStack, CarpetRule, Object, String)} instead! It will get abstract soon!
     */
    @Deprecated(forRemoval = true)
    public abstract T validate(CommandSourceStack source, ParsedRule<T> currentRule, T newValue, String string);


    static class StrictValidator<T> extends carpet.api.settings.Validator<T>
    {
        @Override
        public T validate(CommandSourceStack source, CarpetRule<T> currentRule, T newValue, String string)
        {
            if (!currentRule.suggestions().contains(string))
            {
                Messenger.m(source, "r Valid options: " + currentRule.suggestions().toString());
                return null;
            }
            return newValue;
        }
    }
}
