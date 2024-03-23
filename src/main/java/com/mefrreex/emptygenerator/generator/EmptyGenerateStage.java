package com.mefrreex.emptygenerator.generator;

import cn.nukkit.level.format.ChunkState;
import cn.nukkit.level.generator.ChunkGenerateContext;
import cn.nukkit.level.generator.GenerateStage;

public class EmptyGenerateStage extends GenerateStage {

    public static final String NAME = "empty_generate";

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public void apply(ChunkGenerateContext context) {
        context.getChunk().setChunkState(ChunkState.POPULATED);
    }
}