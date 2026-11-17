package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iL;
import X.Ey9;
import X.F0C;
import com.facebook.aura.email.viewmodel.EmailEventLogger;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes3.dex */
public final class TextWithButtonHeaderIcon {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ TextWithButtonHeaderIcon[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final TextWithButtonHeaderIcon MAIL;
    public static final TextWithButtonHeaderIcon SHIELD_USER;
    public final String wireValue;

    public final class Companion {

        /* renamed from: com.facebook.aura.model.TextWithButtonHeaderIcon$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.model.TextWithButtonHeaderIcon", TextWithButtonHeaderIcon.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(TextWithButtonHeaderIcon.$cachedSerializer$delegate);
        }

        public final TextWithButtonHeaderIcon fromWire(String str) {
            TextWithButtonHeaderIcon next;
            Iterator<TextWithButtonHeaderIcon> it = TextWithButtonHeaderIcon.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWireValue(), str)) {
                    break;
                }
            }
            return next;
        }

        public final C9hr<TextWithButtonHeaderIcon> serializer() {
            return AnonymousClass001.A12(TextWithButtonHeaderIcon.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        TextWithButtonHeaderIcon textWithButtonHeaderIcon = new TextWithButtonHeaderIcon("SHIELD_USER", 0, "shield_user");
        SHIELD_USER = textWithButtonHeaderIcon;
        TextWithButtonHeaderIcon textWithButtonHeaderIcon2 = new TextWithButtonHeaderIcon("MAIL", 1, EmailEventLogger.SURFACE);
        MAIL = textWithButtonHeaderIcon2;
        TextWithButtonHeaderIcon[] textWithButtonHeaderIconArr = {textWithButtonHeaderIcon, textWithButtonHeaderIcon2};
        $VALUES = textWithButtonHeaderIconArr;
        $ENTRIES = C3cG.A0w(textWithButtonHeaderIconArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<TextWithButtonHeaderIcon> getEntries() {
        return $ENTRIES;
    }

    public static TextWithButtonHeaderIcon valueOf(String str) {
        return (TextWithButtonHeaderIcon) Enum.valueOf(TextWithButtonHeaderIcon.class, str);
    }

    public static TextWithButtonHeaderIcon[] values() {
        return (TextWithButtonHeaderIcon[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public TextWithButtonHeaderIcon(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
