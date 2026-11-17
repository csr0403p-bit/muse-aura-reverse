package X;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CAJ {
    public boolean A00;
    public final C7144EhA A01;
    public final C7144EhA A02;
    public final CAN A03;
    public final CAN A04;
    public final CAN A05;
    public final DAV A06;
    public volatile Uri A07;

    public /* synthetic */ CAJ(CAN can, DAV dav) {
        CAM cam = new CAM();
        CAM cam2 = new CAM();
        C7384Etj.A0Y(dav, 0);
        this.A06 = dav;
        this.A03 = can;
        this.A05 = cam;
        this.A04 = cam2;
        this.A01 = new C7144EhA(2);
        this.A02 = new C7144EhA(3);
    }

    public static final String A00(Intent intent, HashMap<Integer, String> map) {
        int flags;
        if (intent == null || (flags = intent.getFlags()) == 0) {
            return "NO_FLAGS";
        }
        LinkedList linkedListA0y = BV4.A0y();
        Iterator itA0y = BV5.A0y(map);
        while (itA0y.hasNext()) {
            Object next = itA0y.next();
            C7384Etj.A0U(next);
            int iIntValue = ((Number) next).intValue();
            if ((iIntValue & flags) != 0) {
                linkedListA0y.add(map.get(Integer.valueOf(iIntValue)));
            }
        }
        return linkedListA0y.isEmpty() ? "Unknown flags: ${Integer.toBinaryString(flagsOnIncomingIntent)}" : C3cH.A0e(" | ", linkedListA0y);
    }

    public static final void A01(Intent intent, CAJ caj) {
        if (intent != null) {
            ComponentName component = intent.getComponent();
            String action = intent.getAction();
            Set<String> categories = intent.getCategories();
            Uri data = intent.getData();
            String scheme = data != null ? data.getScheme() : null;
            if (component != null) {
                DAV dav = caj.A06;
                String shortClassName = component.getShortClassName();
                C7384Etj.A0U(shortClassName);
                dav.AQF("intentComponent", shortClassName);
            }
            if (action != null) {
                caj.A06.AQF("intentAction", action);
            }
            if (categories != null) {
                caj.A06.AQF("intentCategories", categories.toString());
            }
            if (scheme != null) {
                caj.A06.AQF("intentUriScheme", scheme);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.content.Intent r5, X.CAJ r6, java.lang.Integer r7, java.lang.String r8) {
        /*
            boolean r0 = r6.A00
            if (r0 != 0) goto L5b
            r0 = 1
            r6.A00 = r0
            int r3 = r7.intValue()
            switch(r3) {
                case 0: goto L94;
                case 1: goto L98;
                default: goto Le;
            }
        Le:
            java.lang.String r0 = "Receiver"
        L10:
            java.lang.String r4 = X.AnonymousClass001.A0u(r0)
            X.DAe r0 = X.DAe.A0A
            r0.A01 = r8
            r0 = 0
            if (r5 == 0) goto L22
            r5.getAction()
            android.net.Uri r0 = r5.getData()
        L22:
            r6.A07 = r0
            X.DAV r2 = r6.A06
            java.lang.String r0 = "firstComponent"
            r2.AQF(r0, r4)
            java.lang.String r0 = "firstComponentName"
            r2.AQF(r0, r8)
            java.lang.String r1 = "firstIntentFlags"
            r0 = 0
            if (r3 == r0) goto L8d
            r0 = 2
            if (r3 == r0) goto L8a
            java.lang.String r0 = "null"
        L3a:
            r2.AQF(r1, r0)
            X.C4i r3 = X.C98.A00
            com.facebook.errorreporting.field.ReportFieldString r0 = X.C6B.A66
            X.C4g r2 = X.EnumC3223C4g.CRITICAL_REPORT
            r3.A01(r0, r2, r4)
            com.facebook.errorreporting.field.ReportFieldString r0 = X.C6B.A65
            r3.A01(r0, r2, r8)
            if (r5 == 0) goto L5b
            java.lang.String r1 = r5.getAction()
            if (r1 == 0) goto L58
            com.facebook.errorreporting.field.ReportFieldString r0 = X.C6B.A7I
            r3.A01(r0, r2, r1)
        L58:
            r5.getFlags()
        L5b:
            int r0 = r7.intValue()
            switch(r0) {
                case 0: goto L84;
                case 1: goto L87;
                default: goto L62;
            }
        L62:
            java.lang.String r0 = "Receiver"
        L64:
            java.lang.String r1 = X.AnonymousClass001.A0u(r0)
            X.C4i r3 = X.C98.A00
            com.facebook.errorreporting.field.ReportFieldString r0 = X.C6B.A6G
            X.C4g r2 = X.EnumC3223C4g.CRITICAL_REPORT
            r3.A01(r0, r2, r1)
            com.facebook.errorreporting.field.ReportFieldString r0 = X.C6B.A6F
            r3.A01(r0, r2, r8)
            if (r5 == 0) goto L83
            java.lang.String r1 = r5.getAction()
            if (r1 == 0) goto L83
            com.facebook.errorreporting.field.ReportFieldString r0 = X.C6B.A6H
            r3.A01(r0, r2, r1)
        L83:
            return
        L84:
            java.lang.String r0 = "Activity"
            goto L64
        L87:
            java.lang.String r0 = "Service"
            goto L64
        L8a:
            X.EhA r0 = r6.A02
            goto L8f
        L8d:
            X.EhA r0 = r6.A01
        L8f:
            java.lang.String r0 = A00(r5, r0)
            goto L3a
        L94:
            java.lang.String r0 = "Activity"
            goto L10
        L98:
            java.lang.String r0 = "Service"
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CAJ.A02(android.content.Intent, X.CAJ, java.lang.Integer, java.lang.String):void");
    }
}
