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
public final class UseCase {
    public static final F0C<C9hr<Object>> A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ UseCase[] A02;
    public static final Companion Companion;
    public final int code;

    public final class Companion {
        public final C9hr<UseCase> serializer() {
            return AnonymousClass001.A12(UseCase.A00);
        }
    }

    static {
        UseCase[] useCaseArr = {new UseCase("FOA_NTA", 0, 0), new UseCase("LINKING", 1, 1)};
        A02 = useCaseArr;
        A01 = C3cG.A0w(useCaseArr);
        Companion = new Companion();
        A00 = C2277BSd.A00(C79.A01, 7);
    }

    public static UseCase valueOf(String str) {
        return (UseCase) Enum.valueOf(UseCase.class, str);
    }

    public static UseCase[] values() {
        return (UseCase[]) A02.clone();
    }

    public UseCase(String str, int i, int i2) {
        this.code = i2;
    }
}
