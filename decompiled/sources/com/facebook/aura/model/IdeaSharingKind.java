package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06H;
import X.C79;
import X.C9hr;
import X.C9iL;
import X.Ey9;
import X.F0C;
import X.F3w;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes.dex */
public final class IdeaSharingKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ IdeaSharingKind[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final IdeaSharingKind CATALOG;
    public static final Companion Companion;
    public static final IdeaSharingKind DIRECT;
    public static final IdeaSharingKind GENERALIZED;
    public static final IdeaSharingKind UNAVAILABLE;

    public final class Companion {

        /* renamed from: com.facebook.aura.model.IdeaSharingKind$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.model.IdeaSharingKind", IdeaSharingKind.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(IdeaSharingKind.$cachedSerializer$delegate);
        }

        public final C9hr<IdeaSharingKind> serializer() {
            return AnonymousClass001.A12(IdeaSharingKind.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        IdeaSharingKind ideaSharingKind = new IdeaSharingKind("CATALOG", 0);
        CATALOG = ideaSharingKind;
        IdeaSharingKind ideaSharingKind2 = new IdeaSharingKind("GENERALIZED", 1);
        GENERALIZED = ideaSharingKind2;
        IdeaSharingKind ideaSharingKind3 = new IdeaSharingKind("DIRECT", 2);
        DIRECT = ideaSharingKind3;
        IdeaSharingKind ideaSharingKind4 = new IdeaSharingKind("UNAVAILABLE", 3);
        UNAVAILABLE = ideaSharingKind4;
        IdeaSharingKind[] ideaSharingKindArr = {ideaSharingKind, ideaSharingKind2, ideaSharingKind3, ideaSharingKind4};
        $VALUES = ideaSharingKindArr;
        $ENTRIES = new F3w(ideaSharingKindArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<IdeaSharingKind> getEntries() {
        return $ENTRIES;
    }

    public static IdeaSharingKind valueOf(String str) {
        return (IdeaSharingKind) Enum.valueOf(IdeaSharingKind.class, str);
    }

    public static IdeaSharingKind[] values() {
        return (IdeaSharingKind[]) $VALUES.clone();
    }

    public IdeaSharingKind(String str, int i) {
    }
}
