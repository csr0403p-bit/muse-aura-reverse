package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06H;
import X.C3cG;
import X.C79;
import X.C9hr;
import X.C9iL;
import X.Ey9;
import X.F0C;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes2.dex */
public final class BrowserTaskExecutionKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BrowserTaskExecutionKind[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final BrowserTaskExecutionKind LOCAL_DEVICE;
    public static final BrowserTaskExecutionKind UNSUPPORTED;
    public static final BrowserTaskExecutionKind VM;

    public final class Companion {

        /* renamed from: com.facebook.aura.model.BrowserTaskExecutionKind$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.model.BrowserTaskExecutionKind", BrowserTaskExecutionKind.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(BrowserTaskExecutionKind.$cachedSerializer$delegate);
        }

        public final C9hr<BrowserTaskExecutionKind> serializer() {
            return AnonymousClass001.A12(BrowserTaskExecutionKind.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        BrowserTaskExecutionKind browserTaskExecutionKind = new BrowserTaskExecutionKind("VM", 0);
        VM = browserTaskExecutionKind;
        BrowserTaskExecutionKind browserTaskExecutionKind2 = new BrowserTaskExecutionKind("LOCAL_DEVICE", 1);
        LOCAL_DEVICE = browserTaskExecutionKind2;
        BrowserTaskExecutionKind browserTaskExecutionKind3 = new BrowserTaskExecutionKind("UNSUPPORTED", 2);
        UNSUPPORTED = browserTaskExecutionKind3;
        BrowserTaskExecutionKind[] browserTaskExecutionKindArr = {browserTaskExecutionKind, browserTaskExecutionKind2, browserTaskExecutionKind3};
        $VALUES = browserTaskExecutionKindArr;
        $ENTRIES = C3cG.A0w(browserTaskExecutionKindArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<BrowserTaskExecutionKind> getEntries() {
        return $ENTRIES;
    }

    public static BrowserTaskExecutionKind valueOf(String str) {
        return (BrowserTaskExecutionKind) Enum.valueOf(BrowserTaskExecutionKind.class, str);
    }

    public static BrowserTaskExecutionKind[] values() {
        return (BrowserTaskExecutionKind[]) $VALUES.clone();
    }

    public BrowserTaskExecutionKind(String str, int i) {
    }
}
