package com.google.android.gms.auth.api.signin;

import X.AbstractC4100CmU;
import X.AnonymousClass006;
import X.BV4;
import X.C3cG;
import X.C4158CoD;
import X.C4206Cpu;
import X.CRy;
import X.InterfaceC3786CeU;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

@Deprecated
/* loaded from: classes5.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements InterfaceC3786CeU, ReflectedParcelable {
    public static final GoogleSignInOptions A0B;
    public static final GoogleSignInOptions A0C;
    public static final Scope A0D = new Scope(1, "profile");
    public static final Scope A0E;
    public static final Scope A0F;
    public static final Scope A0G;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public Account A00;
    public String A01;
    public String A02;
    public String A03;
    public ArrayList A04;
    public boolean A05;
    public Map A06;
    public final int A07;
    public final ArrayList A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042 A[Catch: ClassCastException -> 0x007c, TryCatch #0 {ClassCastException -> 0x007c, blocks: (B:5:0x0004, B:7:0x000e, B:9:0x0016, B:11:0x0028, B:13:0x0032, B:15:0x0036, B:17:0x003a, B:19:0x0042, B:21:0x004a, B:29:0x0063, B:31:0x0069, B:33:0x006f, B:22:0x004f, B:25:0x0058), top: B:40:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[Catch: ClassCastException -> 0x007c, TryCatch #0 {ClassCastException -> 0x007c, blocks: (B:5:0x0004, B:7:0x000e, B:9:0x0016, B:11:0x0028, B:13:0x0032, B:15:0x0036, B:17:0x003a, B:19:0x0042, B:21:0x004a, B:29:0x0063, B:31:0x0069, B:33:0x006f, B:22:0x004f, B:25:0x0058), top: B:40:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 0
            if (r6 != 0) goto L4
            return r4
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r6 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r6     // Catch: java.lang.ClassCastException -> L7c
            java.util.ArrayList r0 = r5.A04     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = r0.isEmpty()     // Catch: java.lang.ClassCastException -> L7c
            if (r0 == 0) goto L7c
            java.util.ArrayList r0 = r6.A04     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = r0.isEmpty()     // Catch: java.lang.ClassCastException -> L7c
            if (r0 == 0) goto L7c
            java.util.ArrayList r3 = r5.A08     // Catch: java.lang.ClassCastException -> L7c
            int r2 = r3.size()     // Catch: java.lang.ClassCastException -> L7c
            java.util.ArrayList r1 = r6.A08     // Catch: java.lang.ClassCastException -> L7c
            java.util.ArrayList r0 = X.BV4.A0t(r1)     // Catch: java.lang.ClassCastException -> L7c
            int r0 = r0.size()     // Catch: java.lang.ClassCastException -> L7c
            if (r2 != r0) goto L7c
            java.util.ArrayList r0 = X.BV4.A0t(r1)     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = r3.containsAll(r0)     // Catch: java.lang.ClassCastException -> L7c
            if (r0 == 0) goto L7c
            android.accounts.Account r1 = r5.A00     // Catch: java.lang.ClassCastException -> L7c
            if (r1 != 0) goto L58
            android.accounts.Account r0 = r6.A00     // Catch: java.lang.ClassCastException -> L7c
            if (r0 != 0) goto L7c
        L3a:
            java.lang.String r1 = r5.A01     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7c
            if (r0 == 0) goto L4f
            java.lang.String r0 = r6.A01     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.ClassCastException -> L7c
            if (r0 == 0) goto L7c
        L4a:
            boolean r1 = r5.A0A     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = r6.A0A     // Catch: java.lang.ClassCastException -> L7c
            goto L61
        L4f:
            java.lang.String r0 = r6.A01     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = r1.equals(r0)     // Catch: java.lang.ClassCastException -> L7c
            if (r0 != 0) goto L4a
            goto L7b
        L58:
            android.accounts.Account r0 = r6.A00     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = r1.equals(r0)     // Catch: java.lang.ClassCastException -> L7c
            if (r0 == 0) goto L7c
            goto L3a
        L61:
            if (r1 != r0) goto L7c
            boolean r1 = r5.A05     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = r6.A05     // Catch: java.lang.ClassCastException -> L7c
            if (r1 != r0) goto L7c
            boolean r1 = r5.A09     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = r6.A09     // Catch: java.lang.ClassCastException -> L7c
            if (r1 != r0) goto L7c
            java.lang.String r1 = r5.A03     // Catch: java.lang.ClassCastException -> L7c
            java.lang.String r0 = r6.A03     // Catch: java.lang.ClassCastException -> L7c
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: java.lang.ClassCastException -> L7c
            if (r0 == 0) goto L7c
            r0 = 1
            return r0
        L7b:
            return r4
        L7c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    static {
        CRy.A07("email", "scopeUri must not be null or empty");
        A0E = new Scope(1, "openid");
        Scope scope = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        A0F = scope;
        A0G = new Scope(1, "https://www.googleapis.com/auth/games");
        C4206Cpu c4206Cpu = new C4206Cpu();
        c4206Cpu.A05.add(A0E);
        c4206Cpu.A05.add(A0D);
        A0C = c4206Cpu.A00();
        C4206Cpu c4206Cpu2 = new C4206Cpu();
        Set set = c4206Cpu2.A05;
        set.add(scope);
        set.addAll(Arrays.asList(new Scope[0]));
        A0B = c4206Cpu2.A00();
        CREATOR = C4158CoD.A03(16);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA02 = AbstractSafeParcelable.A02(parcel, this.A07);
        AbstractC4100CmU.A0C(parcel, BV4.A0t(this.A08), 2);
        AbstractC4100CmU.A09(parcel, this.A00, 3, i);
        AbstractC4100CmU.A08(parcel, 4, this.A05);
        AbstractC4100CmU.A08(parcel, 5, this.A09);
        AbstractC4100CmU.A08(parcel, 6, this.A0A);
        AbstractC4100CmU.A0A(parcel, this.A01, 7);
        AbstractC4100CmU.A0A(parcel, this.A02, 8);
        AbstractC4100CmU.A0C(parcel, this.A04, 9);
        AbstractC4100CmU.A0A(parcel, this.A03, 10);
        AbstractC4100CmU.A05(parcel, iA02);
    }

    public GoogleSignInOptions(Account account, String str, String str2, String str3, ArrayList arrayList, Map map, int i, boolean z, boolean z2, boolean z3) {
        this.A07 = i;
        this.A08 = arrayList;
        this.A00 = account;
        this.A05 = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A01 = str;
        this.A02 = str2;
        this.A04 = BV4.A0t(map.values());
        this.A06 = map;
        this.A03 = str3;
    }

    public final int hashCode() {
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayList = this.A08;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayListA0h.add(((Scope) arrayList.get(i)).A01);
        }
        Collections.sort(arrayListA0h);
        return ((((((((((((arrayListA0h.hashCode() + 31) * 31) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass006.A0G(this.A01)) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + AnonymousClass006.A0G(this.A03);
    }
}
