package com.whatsapp.accountlinking.ipc.api.models;

import X.AnonymousClass001;
import X.C2283BSj;
import X.C3cG;
import X.C79;
import X.C9hr;
import X.Ey9;
import X.F0C;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes4.dex */
public final class IpcFeature {
    public static final F0C<C9hr<Object>> A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ IpcFeature[] A02;
    public static final Companion Companion;

    public final class Companion {
        public final C9hr<IpcFeature> serializer() {
            return AnonymousClass001.A12(IpcFeature.A00);
        }
    }

    static {
        IpcFeature[] ipcFeatureArr = {new IpcFeature("QUICK_SENDS", 0), new IpcFeature("IG_REEL_TO_STATUS_CROSSPOST", 1), new IpcFeature("IG_POST_TO_STATUS_CROSSPOST", 2), new IpcFeature("FB_STORY_TO_STATUS_CROSSPOST", 3), new IpcFeature("FB_REEL_TO_STATUS_CROSSPOST", 4), new IpcFeature("FB_POST_TO_STATUS_CROSSPOST", 5), new IpcFeature("IG_STORY_TO_STATUS_CROSSPOST", 6), new IpcFeature("IG_REEL_TO_STATUS_INLINE_PLAYBACK", 7)};
        A02 = ipcFeatureArr;
        A01 = C3cG.A0w(ipcFeatureArr);
        Companion = new Companion();
        A00 = C2283BSj.A01(C79.A01, 46);
    }

    public static IpcFeature valueOf(String str) {
        return (IpcFeature) Enum.valueOf(IpcFeature.class, str);
    }

    public static IpcFeature[] values() {
        return (IpcFeature[]) A02.clone();
    }

    public IpcFeature(String str, int i) {
    }
}
