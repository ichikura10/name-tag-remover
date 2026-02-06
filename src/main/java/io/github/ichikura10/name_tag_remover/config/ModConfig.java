package io.github.ichikura10.name_tag_remover.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModConfig {

    public static final ForgeConfigSpec COMMON_SPEC;

    public static ForgeConfigSpec.BooleanValue RETURN_NAME_TAG;
    public static ForgeConfigSpec.BooleanValue RETURN_NAME_TAG_WHEN_CREATIVE;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.push("general");

        RETURN_NAME_TAG = builder
                .comment("Whether to return the name tag when using the name tag remover" +
                        "\nDefault: true")
                .define("returnNameTag", true);

        RETURN_NAME_TAG_WHEN_CREATIVE = builder
                .comment("Whether to return the name tag when using the name tag remover in creative mode\n" +
                        "If RETURN NAME TAG is false, the name tag will not be returned regardless of this option" +
                        "\nDefault: false")
                .define("returnNameTagWhenCreative", false);

        builder.pop();

        COMMON_SPEC = builder.build();
    }
}
