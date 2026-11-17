package com.facebook.aura.skills.repo;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class ConnectorCatalogInvalidatedException extends CancellationException {
    public ConnectorCatalogInvalidatedException() {
        super("Connector catalog invalidated");
    }
}
