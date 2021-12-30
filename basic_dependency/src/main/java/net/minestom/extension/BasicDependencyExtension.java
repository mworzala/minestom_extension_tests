package net.minestom.extension;

import net.minestom.server.MinecraftServer;
import net.minestom.server.extensions.Extension;
import net.minestom.server.extensions.ExtensionManager;

public class BasicDependencyExtension extends Extension {
    @Override
    public void initialize() {
        ExtensionManager extensionManager = MinecraftServer.getExtensionManager();
        Extension extension = extensionManager.getExtension("Empty");

        if (!(extension instanceof EmptyExtension emptyExtension)) {
            throw new IllegalStateException("Empty extension is not loaded");
        }
    }

    @Override
    public void terminate() {

    }
}
