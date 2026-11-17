package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
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
/* loaded from: classes3.dex */
public final class OptionWidgetButtonStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ OptionWidgetButtonStyle[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final OptionWidgetButtonStyle CENTER_ALIGNED_FILLED;
    public static final Companion Companion;
    public static final OptionWidgetButtonStyle DOTTED_LINES;

    public final class Companion {

        /* renamed from: com.facebook.aura.model.OptionWidgetButtonStyle$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.model.OptionWidgetButtonStyle", OptionWidgetButtonStyle.values());
            }
        }

        public final OptionWidgetButtonStyle fromWireValue(String str) {
            String strA0l;
            return "center_aligned_filled".equals((str == null || (strA0l = AnonymousClass002.A0l(str)) == null) ? null : AnonymousClass001.A0u(strA0l)) ? OptionWidgetButtonStyle.CENTER_ALIGNED_FILLED : OptionWidgetButtonStyle.DOTTED_LINES;
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(OptionWidgetButtonStyle.$cachedSerializer$delegate);
        }

        public final C9hr<OptionWidgetButtonStyle> serializer() {
            return AnonymousClass001.A12(OptionWidgetButtonStyle.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        OptionWidgetButtonStyle optionWidgetButtonStyle = new OptionWidgetButtonStyle("DOTTED_LINES", 0);
        DOTTED_LINES = optionWidgetButtonStyle;
        OptionWidgetButtonStyle optionWidgetButtonStyle2 = new OptionWidgetButtonStyle("CENTER_ALIGNED_FILLED", 1);
        CENTER_ALIGNED_FILLED = optionWidgetButtonStyle2;
        OptionWidgetButtonStyle[] optionWidgetButtonStyleArr = {optionWidgetButtonStyle, optionWidgetButtonStyle2};
        $VALUES = optionWidgetButtonStyleArr;
        $ENTRIES = C3cG.A0w(optionWidgetButtonStyleArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<OptionWidgetButtonStyle> getEntries() {
        return $ENTRIES;
    }

    public static OptionWidgetButtonStyle valueOf(String str) {
        return (OptionWidgetButtonStyle) Enum.valueOf(OptionWidgetButtonStyle.class, str);
    }

    public static OptionWidgetButtonStyle[] values() {
        return (OptionWidgetButtonStyle[]) $VALUES.clone();
    }

    public OptionWidgetButtonStyle(String str, int i) {
    }
}
