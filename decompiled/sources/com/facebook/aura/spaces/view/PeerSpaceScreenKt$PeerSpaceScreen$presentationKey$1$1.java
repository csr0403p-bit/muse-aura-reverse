package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.FGI;
import android.os.SystemClock;
import com.facebook.aura.library.view.PeerSpaceLibraryItemsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class PeerSpaceScreenKt$PeerSpaceScreen$presentationKey$1$1 extends AbstractC7559F3s implements Function0<String> {
    public static final PeerSpaceScreenKt$PeerSpaceScreen$presentationKey$1$1 INSTANCE = new PeerSpaceScreenKt$PeerSpaceScreen$presentationKey$1$1();

    public PeerSpaceScreenKt$PeerSpaceScreen$presentationKey$1$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return FGI.A0B(SystemClock.elapsedRealtimeNanos(), PeerSpaceLibraryItemsKt.PEER_SPACE_REF_PREFIX);
    }
}
