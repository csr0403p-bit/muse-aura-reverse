package androidx.compose.foundation.text.selection;

import X.AGF;
import X.AnonymousClass003;
import X.Au3;
import X.BI3;
import X.BN1;
import X.BQe;
import X.C07288ih;
import X.C07298ii;
import X.C0874AGa;
import X.C3cG;
import X.C78T;
import X.C9258GBl;
import X.EnumC10460Hji;
import X.GAo;
import X.HtJ;
import X.InterfaceC2026Awf;
import X.InterfaceC2261BLa;
import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassifier;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class PlatformSelectionBehaviorsImpl implements InterfaceC2026Awf {
    public TextClassifier A00;
    public final Context A01;
    public final BI3 A02;
    public final C78T A05;
    public final C0874AGa A07;
    public final InterfaceC2261BLa A06 = new C9258GBl();
    public final MutableState A03 = C3cG.A08(AGF.A01(), null);
    public final Object A04 = C3cG.A0T();

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(android.view.textclassifier.TextClassifier r9, androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl r10, java.lang.CharSequence r11, X.HtJ r12, long r13) {
        /*
            r3 = 0
            boolean r0 = r12 instanceof X.C8iV
            if (r0 == 0) goto L39
            r4 = r12
            X.8iV r4 = (X.C8iV) r4
            int r0 = r4.$t
            if (r0 != r3) goto L39
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r8 = r4.A05
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.A00
            r5 = 2
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L56
            if (r1 == r0) goto L44
            if (r1 != r5) goto L3f
            long r13 = r4.A01
            java.lang.Object r7 = r4.A04
            X.BLa r7 = (X.InterfaceC2261BLa) r7
            java.lang.Object r6 = r4.A03
            android.view.textclassifier.TextClassification r6 = (android.view.textclassifier.TextClassification) r6
            java.lang.Object r11 = r4.A02
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            X.Hwg.A00(r8)
            goto Lbd
        L39:
            X.8iV r4 = new X.8iV
            r4.<init>(r10, r12, r3)
            goto L17
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L44:
            long r13 = r4.A01
            java.lang.Object r7 = r4.A04
            X.BLa r7 = (X.InterfaceC2261BLa) r7
            java.lang.Object r9 = r4.A03
            android.view.textclassifier.TextClassifier r9 = (android.view.textclassifier.TextClassifier) r9
            java.lang.Object r11 = r4.A02
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            X.Hwg.A00(r8)
            goto L6c
        L56:
            X.Hwg.A00(r8)
            X.BLa r7 = r10.A06
            r4.A02 = r11
            r4.A03 = r9
            r4.A04 = r7
            r4.A01 = r13
            r4.A00 = r0
            java.lang.Object r0 = r7.APs(r2, r4)
            if (r0 != r3) goto L6c
            return r3
        L6c:
            androidx.compose.runtime.MutableState r0 = r10.A03     // Catch: java.lang.Throwable -> Ld2
            java.lang.Object r8 = r0.getValue()     // Catch: java.lang.Throwable -> Ld2
            X.6Xb r8 = (X.C6Xb) r8     // Catch: java.lang.Throwable -> Ld2
            if (r8 == 0) goto L8a
            long r0 = r8.A00     // Catch: java.lang.Throwable -> Ld2
            int r6 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r6 != 0) goto L8a
            java.lang.CharSequence r0 = r8.A02     // Catch: java.lang.Throwable -> Ld2
            boolean r0 = X.C7384Etj.areEqual(r11, r0)     // Catch: java.lang.Throwable -> Ld2
            if (r0 == 0) goto L8a
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Ld2
            r7.Ahe(r2)
            return r3
        L8a:
            r7.Ahe(r2)
            int r6 = X.Au3.A02(r13)
            int r0 = X.Au3.A01(r13)
            android.view.textclassifier.TextClassification$Request$Builder r1 = new android.view.textclassifier.TextClassification$Request$Builder
            r1.<init>(r11, r6, r0)
            android.os.LocaleList r0 = A00(r10)
            android.view.textclassifier.TextClassification$Request$Builder r0 = r1.setDefaultLocales(r0)
            android.view.textclassifier.TextClassification$Request r0 = r0.build()
            android.view.textclassifier.TextClassification r6 = r9.classifyText(r0)
            X.BLa r7 = r10.A06
            r4.A02 = r11
            r4.A03 = r6
            r4.A04 = r7
            r4.A01 = r13
            r4.A00 = r5
            java.lang.Object r0 = r7.APs(r2, r4)
            if (r0 != r3) goto Lbd
            return r3
        Lbd:
            X.6Xb r1 = new X.6Xb     // Catch: java.lang.Throwable -> Lcd
            r1.<init>(r6, r11, r13)     // Catch: java.lang.Throwable -> Lcd
            androidx.compose.runtime.MutableState r0 = r10.A03     // Catch: java.lang.Throwable -> Lcd
            r0.Af8(r1)     // Catch: java.lang.Throwable -> Lcd
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lcd
            r7.Ahe(r2)
            return r3
        Lcd:
            r0 = move-exception
            r7.Ahe(r2)
            throw r0
        Ld2:
            r0 = move-exception
            r7.Ahe(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl.A01(android.view.textclassifier.TextClassifier, androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl, java.lang.CharSequence, X.HtJ, long):java.lang.Object");
    }

    @Override // X.InterfaceC2026Awf
    public final Object AVs(CharSequence charSequence, HtJ htJ, long j) {
        Object objA00 = (charSequence.length() == 0 || Au3.A04(j)) ? Unit.INSTANCE : GAo.A00(htJ, this.A05, new C07298ii(this, new C07288ih(this, charSequence, null, j), null, 0));
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/CharSequence;JLX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    @Override // X.InterfaceC2026Awf
    public final Object AVt(CharSequence charSequence, HtJ htJ, long j) {
        Object objA00 = (charSequence.length() == 0 || Au3.A04(j)) ? Unit.INSTANCE : GAo.A00(htJ, this.A05, new C07298ii(this, new C07288ih(this, charSequence, null, j), null, 0));
        return objA00 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA00;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/CharSequence;JLX/HtJ<-LX/Au3;>;)Ljava/lang/Object; */
    @Override // X.InterfaceC2026Awf
    public final Object Agd(CharSequence charSequence, HtJ htJ, long j) {
        if (charSequence.length() == 0 || Au3.A04(j)) {
            return null;
        }
        return GAo.A00(htJ, this.A05, new C07298ii(this, new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(this, charSequence, null, j), null, 0));
    }

    public static final LocaleList A00(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl) {
        Locale[] localeArr;
        C0874AGa c0874AGa = platformSelectionBehaviorsImpl.A07;
        if (c0874AGa != null) {
            ArrayList arrayListA0i = AnonymousClass003.A0i(c0874AGa);
            Iterator<BN1> it = c0874AGa.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(it.next().A00);
            }
            Locale[] localeArr2 = (Locale[]) arrayListA0i.toArray(new Locale[0]);
            localeArr = (Locale[]) Arrays.copyOf(localeArr2, localeArr2.length);
        } else {
            localeArr = new Locale[]{BQe.A00.AEM().A01.get(0).A00};
        }
        return new LocaleList(localeArr);
    }

    public PlatformSelectionBehaviorsImpl(Context context, BI3 bi3, C0874AGa c0874AGa, C78T c78t) {
        this.A05 = c78t;
        this.A01 = context;
        this.A02 = bi3;
        this.A07 = c0874AGa;
    }
}
