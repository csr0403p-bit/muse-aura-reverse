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
public final class ContextualUnpauseResult {
    public static final F0C<C9hr<Object>> A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ ContextualUnpauseResult[] A02;
    public static final Companion Companion;

    public final class Companion {
        public final C9hr<ContextualUnpauseResult> serializer() {
            return AnonymousClass001.A12(ContextualUnpauseResult.A00);
        }
    }

    static {
        ContextualUnpauseResult[] contextualUnpauseResultArr = {new ContextualUnpauseResult("ENABLED", 0), new ContextualUnpauseResult("NOT_ENABLED", 1), new ContextualUnpauseResult("FALLBACK", 2)};
        A02 = contextualUnpauseResultArr;
        A01 = C3cG.A0w(contextualUnpauseResultArr);
        Companion = new Companion();
        A00 = C2283BSj.A01(C79.A01, 37);
    }

    public static ContextualUnpauseResult valueOf(String str) {
        return (ContextualUnpauseResult) Enum.valueOf(ContextualUnpauseResult.class, str);
    }

    public static ContextualUnpauseResult[] values() {
        return (ContextualUnpauseResult[]) A02.clone();
    }

    public ContextualUnpauseResult(String str, int i) {
    }
}
