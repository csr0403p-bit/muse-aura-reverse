package com.facebook.tigon.tigonobserver.interfaces;

/* loaded from: classes5.dex */
public interface TigonRequestStarted extends TigonRequestAdded {
    int attempts();

    long tsStartedMs();
}
