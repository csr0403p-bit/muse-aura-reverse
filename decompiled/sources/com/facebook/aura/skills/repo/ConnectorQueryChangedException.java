package com.facebook.aura.skills.repo;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class ConnectorQueryChangedException extends CancellationException {
    public ConnectorQueryChangedException() {
        super("Connector query replaced");
    }
}
