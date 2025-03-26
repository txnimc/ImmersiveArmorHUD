import toni.blahaj.setup.modRuntimeOnly

plugins {
	id("toni.blahaj")
}

blahaj {
	config { }
	setup {
		txnilib("1.0.22")
		forgeConfig()

		if (mod.isForge) {
			deps.modRuntimeOnly(modrinth("overflowing-bars", "v8.0.1-1.20.1-Forge"))
			deps.modRuntimeOnly(modrinth("puzzles-lib", "v8.1.29-1.20.1-Forge"))
			deps.modRuntimeOnly("fuzs.puzzlesaccessapi:puzzlesaccessapi-forge:20.1.1")

			deps.compileOnly(deps.annotationProcessor("io.github.llamalad7:mixinextras-common:0.4.1")!!)
			deps.implementation(deps.include("io.github.llamalad7:mixinextras-forge:0.4.1")!!)
		}
	}
}