package com.whatsapp.accountlinking.ipc.api.models;

import X.AnonymousClass001;
import X.C2277BSd;
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
public final class StatusApiFeature {
    public static final F0C<C9hr<Object>> A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ StatusApiFeature[] A02;
    public static final Companion Companion;

    public final class Companion {
        public final C9hr<StatusApiFeature> serializer() {
            return AnonymousClass001.A12(StatusApiFeature.A00);
        }
    }

    static {
        StatusApiFeature[] statusApiFeatureArr = {new StatusApiFeature()};
        A02 = statusApiFeatureArr;
        A01 = C3cG.A0w(statusApiFeatureArr);
        Companion = new Companion();
        A00 = C2277BSd.A00(C79.A01, 3);
    }

    public static StatusApiFeature valueOf(String str) {
        return (StatusApiFeature) Enum.valueOf(StatusApiFeature.class, str);
    }

    public static StatusApiFeature[] values() {
        return (StatusApiFeature[]) A02.clone();
    }
}
