package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass001;
import X.BV6;
import X.BYU;
import X.C3cI;
import X.C4158CoD;
import X.CS7;
import X.DA8;
import X.DWr;
import X.F60;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = C4158CoD.A03(40);
    public final AuthenticationExtensionsClientOutputs A00;
    public final AuthenticatorAssertionResponse A01;
    public final AuthenticatorAttestationResponse A02;
    public final AuthenticatorErrorResponse A03;
    public final DA8 A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PublicKeyCredential(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r5, com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r6, com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r7, com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, byte[] r12) {
        /*
            r4 = this;
            if (r12 != 0) goto L37
            r3 = 0
        L3:
            r4.<init>()
            r2 = 1
            if (r7 == 0) goto L31
            if (r6 != 0) goto Ld
        Lb:
            if (r8 == 0) goto L35
        Ld:
            r1 = 0
        Le:
            java.lang.String r0 = "Must provide a response object."
            X.CRy.A08(r1, r0)
            if (r8 != 0) goto L19
            if (r9 == 0) goto L2f
            if (r3 == 0) goto L2f
        L19:
            java.lang.String r0 = "Must provide id and rawId if not an error response."
            X.CRy.A08(r2, r0)
            r4.A05 = r9
            r4.A06 = r10
            r4.A04 = r3
            r4.A02 = r7
            r4.A01 = r6
            r4.A03 = r8
            r4.A00 = r5
            r4.A07 = r11
            return
        L2f:
            r2 = 0
            goto L19
        L31:
            if (r6 != 0) goto Lb
            if (r8 == 0) goto Ld
        L35:
            r1 = 1
            goto Le
        L37:
            int r0 = r12.length
            X.DA9 r3 = X.DA8.A01(r12, r0)
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.<init>(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs, com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse, com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse, com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse, java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        if (CS7.A01(this.A05, publicKeyCredential.A05) && CS7.A01(this.A06, publicKeyCredential.A06) && CS7.A01(this.A04, publicKeyCredential.A04) && CS7.A01(this.A02, publicKeyCredential.A02) && CS7.A01(this.A01, publicKeyCredential.A01) && CS7.A01(this.A03, publicKeyCredential.A03) && CS7.A01(this.A00, publicKeyCredential.A00)) {
            return CS7.A00(this.A07, publicKeyCredential.A07);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A06, this.A04, this.A01, this.A02, this.A03, this.A00, this.A07});
    }

    public final String toString() {
        DA8 da8 = this.A04;
        byte[] bArrA04 = da8 == null ? null : da8.A04();
        String str = this.A06;
        String str2 = this.A05;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.A02;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.A01;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.A03;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.A00;
        String str3 = this.A07;
        String strA0q = bArrA04 == null ? null : BV6.A0q(bArrA04);
        String strValueOf = String.valueOf(authenticatorAttestationResponse);
        String strValueOf2 = String.valueOf(authenticatorAssertionResponse);
        String strValueOf3 = String.valueOf(authenticatorErrorResponse);
        String strValueOf4 = String.valueOf(authenticationExtensionsClientOutputs);
        StringBuilder sbA0x = C3cI.A0x("PublicKeyCredential{\n id='", str2);
        sbA0x.append("', \n type='");
        sbA0x.append(str);
        sbA0x.append("', \n rawId=");
        sbA0x.append(strA0q);
        sbA0x.append(", \n registerResponse=");
        sbA0x.append(strValueOf);
        sbA0x.append(", \n signResponse=");
        sbA0x.append(strValueOf2);
        sbA0x.append(", \n errorResponse=");
        sbA0x.append(strValueOf3);
        sbA0x.append(", \n extensionsClientOutputs=");
        sbA0x.append(strValueOf4);
        sbA0x.append(", \n authenticatorAttachment='");
        sbA0x.append(str3);
        return AnonymousClass001.A0v("'}", sbA0x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        BYU.A01.A00.AjM();
        DWr.A0A.AjM();
        throw F60.createAndThrow();
    }
}
