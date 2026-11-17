package com.facebook.aura.shopping.model;

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
/* loaded from: classes4.dex */
public final class PdpActionStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PdpActionStyle[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final PdpActionStyle PRIMARY;
    public static final PdpActionStyle SECONDARY;

    public final class Companion {

        /* renamed from: com.facebook.aura.shopping.model.PdpActionStyle$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.shopping.model.PdpActionStyle", PdpActionStyle.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(PdpActionStyle.$cachedSerializer$delegate);
        }

        public final C9hr<PdpActionStyle> serializer() {
            return AnonymousClass001.A12(PdpActionStyle.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        PdpActionStyle pdpActionStyle = new PdpActionStyle("PRIMARY", 0);
        PRIMARY = pdpActionStyle;
        PdpActionStyle pdpActionStyle2 = new PdpActionStyle("SECONDARY", 1);
        SECONDARY = pdpActionStyle2;
        PdpActionStyle[] pdpActionStyleArr = {pdpActionStyle, pdpActionStyle2};
        $VALUES = pdpActionStyleArr;
        $ENTRIES = C3cG.A0w(pdpActionStyleArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<PdpActionStyle> getEntries() {
        return $ENTRIES;
    }

    public static PdpActionStyle valueOf(String str) {
        return (PdpActionStyle) Enum.valueOf(PdpActionStyle.class, str);
    }

    public static PdpActionStyle[] values() {
        return (PdpActionStyle[]) $VALUES.clone();
    }

    public PdpActionStyle(String str, int i) {
    }
}
