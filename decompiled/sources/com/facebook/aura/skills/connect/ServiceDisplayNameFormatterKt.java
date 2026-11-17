package com.facebook.aura.skills.connect;

import X.AbstractC06907md;
import X.AbstractC7559F3s;
import X.AnonymousClass007;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import X.G0U;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ServiceDisplayNameFormatterKt {

    /* renamed from: com.facebook.aura.skills.connect.ServiceDisplayNameFormatterKt$formatServiceDisplayName$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<String, CharSequence> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(String str) {
            String str2 = str;
            C7384Etj.A0Y(str2, 0);
            return ServiceDisplayNameFormatterKt.capitalizeFirstCodePoint(str2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final CharSequence invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            return ServiceDisplayNameFormatterKt.capitalizeFirstCodePoint(str);
        }
    }

    public static final String formatServiceDisplayName(String str) {
        C7384Etj.A0Y(str, 0);
        List listA0h = C7BY.A0h(str.replace('_', ' ').replace('-', ' '), new char[1], ' ');
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA0h.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it);
        }
        return AbstractC06907md.A01(InviteCodeScratcherKt.CODE_SEPARATOR, arrayListA0h, AnonymousClass2.INSTANCE);
    }

    public static final String capitalizeFirstCodePoint(String str) {
        if (str.length() == 0) {
            return str;
        }
        int iCodePointAt = str.codePointAt(0);
        int iCharCount = Character.charCount(iCodePointAt);
        char[] chars = Character.toChars(Character.toTitleCase(iCodePointAt));
        C7384Etj.A0U(chars);
        return FGI.A0M(new String(chars), str.substring(iCharCount));
    }
}
