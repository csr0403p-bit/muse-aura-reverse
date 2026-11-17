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
/* loaded from: classes3.dex */
public final class TextWithButtonCtaStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ TextWithButtonCtaStyle[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final TextWithButtonCtaStyle PRIMARY;
    public static final TextWithButtonCtaStyle SECONDARY;

    public final class Companion {

        /* renamed from: com.facebook.aura.model.TextWithButtonCtaStyle$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.model.TextWithButtonCtaStyle", TextWithButtonCtaStyle.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(TextWithButtonCtaStyle.$cachedSerializer$delegate);
        }

        public final C9hr<TextWithButtonCtaStyle> serializer() {
            return AnonymousClass001.A12(TextWithButtonCtaStyle.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        TextWithButtonCtaStyle textWithButtonCtaStyle = new TextWithButtonCtaStyle("PRIMARY", 0);
        PRIMARY = textWithButtonCtaStyle;
        TextWithButtonCtaStyle textWithButtonCtaStyle2 = new TextWithButtonCtaStyle("SECONDARY", 1);
        SECONDARY = textWithButtonCtaStyle2;
        TextWithButtonCtaStyle[] textWithButtonCtaStyleArr = {textWithButtonCtaStyle, textWithButtonCtaStyle2};
        $VALUES = textWithButtonCtaStyleArr;
        $ENTRIES = C3cG.A0w(textWithButtonCtaStyleArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<TextWithButtonCtaStyle> getEntries() {
        return $ENTRIES;
    }

    public static TextWithButtonCtaStyle valueOf(String str) {
        return (TextWithButtonCtaStyle) Enum.valueOf(TextWithButtonCtaStyle.class, str);
    }

    public static TextWithButtonCtaStyle[] values() {
        return (TextWithButtonCtaStyle[]) $VALUES.clone();
    }

    public TextWithButtonCtaStyle(String str, int i) {
    }
}
