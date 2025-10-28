package jaschrs.adc;

import net.fabricmc.api.ModInitializer;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Audibledurabilitycues implements ModInitializer {
	public static final String MOD_ID = "audible-durability-cues";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		Registry.register(Registries.SOUND_EVENT, Identifier.of(MOD_ID, "50p"),
				SoundEvent.of(Identifier.of(MOD_ID, "50p")));

		Registry.register(Registries.SOUND_EVENT, Identifier.of(MOD_ID, "10p"),
				SoundEvent.of(Identifier.of(MOD_ID, "10p")));

		Registry.register(Registries.SOUND_EVENT, Identifier.of(MOD_ID, "01p"),
				SoundEvent.of(Identifier.of(MOD_ID, "01p")));

	}
}