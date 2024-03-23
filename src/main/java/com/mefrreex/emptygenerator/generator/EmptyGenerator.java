package com.mefrreex.emptygenerator.generator;

import cn.nukkit.level.DimensionData;
import cn.nukkit.level.generator.GenerateStage;
import cn.nukkit.level.generator.Generator;
import cn.nukkit.level.generator.stages.FinishedStage;
import cn.nukkit.registry.Registries;

import java.util.Map;

public class EmptyGenerator extends Generator {

    public static final String NAME = "empty";

    public EmptyGenerator(DimensionData dimensionData, Map<String, Object> options) {
        super(dimensionData, options);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void stages(GenerateStage.Builder builder) {
        builder.start(Registries.GENERATE_STAGE.get(EmptyGenerateStage.NAME));
        builder.next(Registries.GENERATE_STAGE.get(FinishedStage.NAME));
    }
}
