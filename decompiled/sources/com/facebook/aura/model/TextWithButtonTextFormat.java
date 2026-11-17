package com.facebook.aura.model;

import X.AbstractC2159Azp;
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
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes3.dex */
public final class TextWithButtonTextFormat {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ TextWithButtonTextFormat[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final TextWithButtonTextFormat MARKDOWN;
    public static final TextWithButtonTextFormat PLAIN;
    public final String wireValue;

    public final class Companion {

        /* renamed from: com.facebook.aura.model.TextWithButtonTextFormat$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.model.TextWithButtonTextFormat", TextWithButtonTextFormat.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(TextWithButtonTextFormat.$cachedSerializer$delegate);
        }

        public final TextWithButtonTextFormat fromWire(String str) {
            TextWithButtonTextFormat textWithButtonTextFormat;
            Iterator<TextWithButtonTextFormat> it = TextWithButtonTextFormat.getEntries().iterator();
            while (true) {
                textWithButtonTextFormat = null;
                if (!it.hasNext()) {
                    break;
                }
                TextWithButtonTextFormat next = it.next();
                TextWithButtonTextFormat textWithButtonTextFormat2 = next;
                if (textWithButtonTextFormat2 != TextWithButtonTextFormat.PLAIN) {
                    if (AbstractC2159Azp.A12(textWithButtonTextFormat2.getWireValue(), str != null ? AnonymousClass002.A0l(str) : null, true)) {
                        textWithButtonTextFormat = next;
                        break;
                    }
                }
            }
            TextWithButtonTextFormat textWithButtonTextFormat3 = textWithButtonTextFormat;
            return textWithButtonTextFormat3 == null ? TextWithButtonTextFormat.PLAIN : textWithButtonTextFormat3;
        }

        public final C9hr<TextWithButtonTextFormat> serializer() {
            return AnonymousClass001.A12(TextWithButtonTextFormat.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        TextWithButtonTextFormat textWithButtonTextFormat = new TextWithButtonTextFormat("PLAIN", 0, "plain");
        PLAIN = textWithButtonTextFormat;
        TextWithButtonTextFormat textWithButtonTextFormat2 = new TextWithButtonTextFormat("MARKDOWN", 1, "markdown");
        MARKDOWN = textWithButtonTextFormat2;
        TextWithButtonTextFormat[] textWithButtonTextFormatArr = {textWithButtonTextFormat, textWithButtonTextFormat2};
        $VALUES = textWithButtonTextFormatArr;
        $ENTRIES = C3cG.A0w(textWithButtonTextFormatArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<TextWithButtonTextFormat> getEntries() {
        return $ENTRIES;
    }

    public static TextWithButtonTextFormat valueOf(String str) {
        return (TextWithButtonTextFormat) Enum.valueOf(TextWithButtonTextFormat.class, str);
    }

    public static TextWithButtonTextFormat[] values() {
        return (TextWithButtonTextFormat[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public TextWithButtonTextFormat(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
