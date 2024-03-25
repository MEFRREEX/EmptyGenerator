package com.mefrreex.emptygenerator;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.registry.RegisterException;
import cn.nukkit.registry.Registries;
import com.mefrreex.emptygenerator.generator.EmptyGenerateStage;
import com.mefrreex.emptygenerator.generator.EmptyGenerator;

public class EmptyWorldGenerator extends PluginBase {
    
    @Override
    public void onLoad() {
        try {
            Registries.GENERATE_STAGE.register(EmptyGenerateStage.NAME, EmptyGenerateStage.class);
            Registries.GENERATOR.register(EmptyGenerator.NAME, EmptyGenerator.class);
        } catch (RegisterException e) {
            e.printStackTrace();
        }
    }
}
