package carpet.script.utils;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.Map;

import static java.util.Map.entry;

public class Colors
{
    public static final Map<SoundType, String> soundName = Map.ofEntries(
            entry(SoundType.WOOD,   "wood"  ),
            entry(SoundType.GRAVEL, "gravel"),
            entry(SoundType.GRASS,  "grass" ),
            entry(SoundType.LILY_PAD, "lily_pad"),
            entry(SoundType.STONE,  "stone" ),
            entry(SoundType.METAL,  "metal" ),
            entry(SoundType.GLASS , "glass" ),
            entry(SoundType.WOOL  , "wool"  ),
            entry(SoundType.SAND  , "sand"  ),
            entry(SoundType.SNOW  , "snow"  ),
            entry(SoundType.POWDER_SNOW  , "powder_snow"  ),
            entry(SoundType.LADDER, "ladder"),
            entry(SoundType.ANVIL , "anvil" ),
            entry(SoundType.SLIME_BLOCK  , "slime"  ),
            entry(SoundType.HONEY_BLOCK  , "honey"  ),
            entry(SoundType.WET_GRASS , "sea_grass" ),
            entry(SoundType.CORAL_BLOCK , "coral" ),
            entry(SoundType.BAMBOO , "bamboo" ),
            entry(SoundType.BAMBOO_SAPLING , "shoots" ),
            entry(SoundType.SCAFFOLDING , "scaffolding" ),
            entry(SoundType.SWEET_BERRY_BUSH , "berry" ),
            entry(SoundType.CROP , "crop" ),
            entry(SoundType.HARD_CROP , "stem" ),
            entry(SoundType.VINE , "vine" ),
            entry(SoundType.NETHER_WART , "wart" ),
            entry(SoundType.LANTERN , "lantern" ),
            entry(SoundType.STEM, "fungi_stem"),
            entry(SoundType.NYLIUM, "nylium"),
            entry(SoundType.FUNGUS, "fungus"),
            entry(SoundType.ROOTS, "roots"),
            entry(SoundType.SHROOMLIGHT, "shroomlight"),
            entry(SoundType.WEEPING_VINES, "weeping_vine"),
            entry(SoundType.TWISTING_VINES, "twisting_vine"),
            entry(SoundType.SOUL_SAND, "soul_sand"),
            entry(SoundType.SOUL_SOIL, "soul_soil"),
            entry(SoundType.BASALT, "basalt"),
            entry(SoundType.WART_BLOCK, "wart"),
            entry(SoundType.NETHERRACK, "netherrack"),
            entry(SoundType.NETHER_BRICKS, "nether_bricks"),
            entry(SoundType.NETHER_SPROUTS, "nether_sprouts"),
            entry(SoundType.NETHER_ORE, "nether_ore"),
            entry(SoundType.BONE_BLOCK, "bone"),
            entry(SoundType.NETHERITE_BLOCK, "netherite"),
            entry(SoundType.ANCIENT_DEBRIS, "ancient_debris"),
            entry(SoundType.LODESTONE, "lodestone"),
            entry(SoundType.CHAIN, "chain"),
            entry(SoundType.NETHER_GOLD_ORE, "nether_gold_ore"),
            entry(SoundType.GILDED_BLACKSTONE, "gilded_blackstone"),
            entry(SoundType.CANDLE, "candle"),
            entry(SoundType.AMETHYST, "amethyst"),
            entry(SoundType.AMETHYST_CLUSTER, "amethyst_cluster"),
            entry(SoundType.SMALL_AMETHYST_BUD, "small_amethyst_bud"),
            entry(SoundType.MEDIUM_AMETHYST_BUD, "medium_amethyst_bud"),
            entry(SoundType.LARGE_AMETHYST_BUD, "large_amethyst_bud"),

            entry(SoundType.TUFF, "tuff"),
            entry(SoundType.CALCITE, "calcite"),
            entry(SoundType.DRIPSTONE_BLOCK, "dripstone"),
            entry(SoundType.POINTED_DRIPSTONE, "pointed_dripstone"),
            entry(SoundType.COPPER, "copper"),
            entry(SoundType.CAVE_VINES, "cave_vine"),
            entry(SoundType.SPORE_BLOSSOM, "spore_blossom"),
            entry(SoundType.AZALEA, "azalea"),
            entry(SoundType.FLOWERING_AZALEA, "flowering_azalea"),
            entry(SoundType.MOSS_CARPET, "moss_carpet"),
            entry(SoundType.MOSS, "moss"),
            entry(SoundType.BIG_DRIPLEAF, "big_dripleaf"),
            entry(SoundType.SMALL_DRIPLEAF, "small_dripleaf"),
            entry(SoundType.ROOTED_DIRT, "rooted_dirt"),
            entry(SoundType.HANGING_ROOTS, "hanging_roots"),
            entry(SoundType.AZALEA_LEAVES, "azalea_leaves"),
            entry(SoundType.SCULK_SENSOR, "sculk_sensor"),
            entry(SoundType.GLOW_LICHEN, "glow_lichen"),
            entry(SoundType.DEEPSLATE, "deepslate"),
            entry(SoundType.DEEPSLATE_BRICKS, "deepslate_bricks"),
            entry(SoundType.DEEPSLATE_TILES, "deepslate_tiles"),
            entry(SoundType.POLISHED_DEEPSLATE, "polished_deepslate")
    );

    public static final Map<MaterialColor, String> mapColourName = Map.ofEntries(
            entry(MaterialColor.NONE     , "air"       ),
            entry(MaterialColor.GRASS     , "grass"     ),
            entry(MaterialColor.SAND       , "sand"      ),
            entry(MaterialColor.WOOL        , "wool"      ),
            entry(MaterialColor.FIRE       , "tnt"       ),
            entry(MaterialColor.ICE        , "ice"       ),
            entry(MaterialColor.METAL      , "iron"      ),
            entry(MaterialColor.PLANT    , "foliage"   ),
            entry(MaterialColor.SNOW     , "snow"      ),
            entry(MaterialColor.CLAY       , "clay"      ),
            entry(MaterialColor.DIRT       , "dirt"      ),
            entry(MaterialColor.STONE      , "stone"     ),
            entry(MaterialColor.WATER      , "water"     ),
            entry(MaterialColor.WOOD       , "wood"      ),
            entry(MaterialColor.QUARTZ     , "quartz"    ),
            entry(MaterialColor.COLOR_ORANGE    , "adobe"     ),
            entry(MaterialColor.COLOR_MAGENTA   , "magenta"   ),
            entry(MaterialColor.COLOR_LIGHT_BLUE, "light_blue"),
            entry(MaterialColor.COLOR_YELLOW    , "yellow"    ),
            entry(MaterialColor.COLOR_LIGHT_GREEN      , "lime"      ),
            entry(MaterialColor.COLOR_PINK      , "pink"      ),
            entry(MaterialColor.COLOR_GRAY      , "gray"      ),
            entry(MaterialColor.COLOR_LIGHT_GRAY, "light_gray"),
            entry(MaterialColor.COLOR_CYAN      , "cyan"      ),
            entry(MaterialColor.COLOR_PURPLE    , "purple"    ),
            entry(MaterialColor.COLOR_BLUE      , "blue"      ),
            entry(MaterialColor.COLOR_BROWN     , "brown"     ),
            entry(MaterialColor.COLOR_GREEN     , "green"     ),
            entry(MaterialColor.COLOR_RED       , "red"       ),
            entry(MaterialColor.COLOR_BLACK     , "black"     ),
            entry(MaterialColor.GOLD      , "gold"      ),
            entry(MaterialColor.DIAMOND    , "diamond"   ),
            entry(MaterialColor.LAPIS      , "lapis"     ),
            entry(MaterialColor.EMERALD    , "emerald"   ),
            entry(MaterialColor.PODZOL     , "obsidian"  ),
            entry(MaterialColor.NETHER     , "netherrack"), //TODO fix these
            entry(MaterialColor.TERRACOTTA_WHITE      , "white_terracotta"      ),
            entry(MaterialColor.TERRACOTTA_ORANGE    , "orange_terracotta"     ),
            entry(MaterialColor.TERRACOTTA_MAGENTA   , "magenta_terracotta"    ),
            entry(MaterialColor.TERRACOTTA_LIGHT_BLUE, "light_blue_terracotta" ),
            entry(MaterialColor.TERRACOTTA_YELLOW    , "yellow_terracotta"     ),
            entry(MaterialColor.TERRACOTTA_LIGHT_GREEN      , "lime_terracotta"       ),
            entry(MaterialColor.TERRACOTTA_PINK      , "pink_terracotta"       ),
            entry(MaterialColor.TERRACOTTA_GRAY      , "gray_terracotta"       ),
            entry(MaterialColor.TERRACOTTA_LIGHT_GRAY, "light_gray_terracotta" ),
            entry(MaterialColor.TERRACOTTA_CYAN      , "cyan_terracotta"       ),
            entry(MaterialColor.TERRACOTTA_PURPLE    , "purple_terracotta"     ),
            entry(MaterialColor.TERRACOTTA_BLUE      , "blue_terracotta"       ),
            entry(MaterialColor.TERRACOTTA_BROWN     , "brown_terracotta"      ),
            entry(MaterialColor.TERRACOTTA_GREEN     , "green_terracotta"      ),
            entry(MaterialColor.TERRACOTTA_RED       , "red_terracotta"        ),
            entry(MaterialColor.TERRACOTTA_BLACK     , "black_terracotta"      ),
            entry(MaterialColor.CRIMSON_NYLIUM        , "crimson_nylium"        ),
            entry(MaterialColor.CRIMSON_STEM         , "crimson_stem"          ),
            entry(MaterialColor.CRIMSON_HYPHAE        , "crimson_hyphae"        ),
            entry(MaterialColor.WARPED_NYLIUM         , "warped_nylium"         ),
            entry(MaterialColor.WARPED_STEM           , "warped_stem"           ),
            entry(MaterialColor.WARPED_HYPHAE         , "warped_hyphae"         ),
            entry(MaterialColor.WARPED_WART_BLOCK           , "warped_wart"           ),
            entry(MaterialColor.DEEPSLATE           , "deepslate"           ),
            entry(MaterialColor.RAW_IRON           , "raw_iron"           ),
            entry(MaterialColor.GLOW_LICHEN           , "glow_lichen"           )
    );

    public static final Map<Material, String> materialName = Map.ofEntries(
            entry(Material.AIR            , "air"          ),
            entry(Material.STRUCTURAL_AIR , "void"         ),
            entry(Material.PORTAL         , "portal"       ),
            entry(Material.CLOTH_DECORATION         , "carpet"       ),
            entry(Material.PLANT          , "plant"        ),
            entry(Material.WATER_PLANT, "water_plant" ),
            entry(Material.REPLACEABLE_PLANT, "vegetation"       ),
            entry(Material.REPLACEABLE_FIREPROOF_PLANT, "nether_shoots"    ),
            entry(Material.REPLACEABLE_WATER_PLANT, "sea_grass"    ),
            entry(Material.WATER          , "water"        ),
            entry(Material.BUBBLE_COLUMN  , "bubble_column"),
            entry(Material.LAVA           , "lava"         ),
            entry(Material.TOP_SNOW     , "snow_layer"   ),
            entry(Material.FIRE           , "fire"         ),
            entry(Material.DECORATION      , "decoration"   ),
            entry(Material.WEB         , "cobweb"       ),
            entry(Material.SCULK         , "sculk"       ),
            entry(Material.BUILDABLE_GLASS  , "redstone_lamp"),
            entry(Material.CLAY, "clay"         ),
            entry(Material.DIRT           , "dirt"         ),
            entry(Material.GRASS  , "grass"        ),
            entry(Material.ICE_SOLID      , "packed_ice"   ),
            entry(Material.SAND      , "sand"         ),
            entry(Material.SPONGE         , "sponge"       ),
            entry(Material.SHULKER_SHELL    , "shulker"      ),
            entry(Material.WOOD           , "wood"         ),
            entry(Material.NETHER_WOOD    , "nether_wood"  ),
            entry(Material.BAMBOO_SAPLING , "shoots"       ),
            entry(Material.BAMBOO         , "bamboo"       ),
            entry(Material.WOOL           , "wool"         ),
            entry(Material.EXPLOSIVE            , "tnt"          ),
            entry(Material.LEAVES         , "leaves"       ),
            entry(Material.GLASS          , "glass"        ),
            entry(Material.ICE            , "ice"          ),
            entry(Material.CACTUS         , "cactus"       ),
            entry(Material.STONE          , "stone"        ),
            entry(Material.METAL          , "metal"        ),
            entry(Material.SNOW     , "snow"         ),
            entry(Material.HEAVY_METAL , "anvil"        ),
            entry(Material.BARRIER        , "barrier"      ),
            entry(Material.PISTON         , "piston"       ),
            entry(Material.MOSS     , "moss"         ),
            entry(Material.VEGETABLE          , "gourd"        ),
            entry(Material.EGG            , "dragon_egg"   ),
            entry(Material.CAKE           , "cake"         ),
            entry(Material.AMETHYST       , "amethyst"     ),
            entry(Material.POWDER_SNOW    , "powder_snow")
    );
}