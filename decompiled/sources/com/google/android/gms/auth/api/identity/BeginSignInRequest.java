package com.google.android.gms.auth.api.identity;

import X.AbstractC4100CmU;
import X.BV4;
import X.BV7;
import X.C4158CoD;
import X.C6xC;
import X.CRy;
import X.CS7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes5.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = C4158CoD.A03(6);
    public final int A00;
    public final GoogleIdTokenRequestOptions A01;
    public final PasskeyJsonRequestOptions A02;
    public final PasskeysRequestOptions A03;
    public final PasswordRequestOptions A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    @Deprecated
    public final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = C4158CoD.A03(9);
        public final String A00;
        public final String A01;
        public final String A02;
        public final List A03;
        public final boolean A04;
        public final boolean A05;
        public final boolean A06;

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.A04 == googleIdTokenRequestOptions.A04 && CS7.A01(this.A00, googleIdTokenRequestOptions.A00) && CS7.A01(this.A01, googleIdTokenRequestOptions.A01) && this.A05 == googleIdTokenRequestOptions.A05 && CS7.A01(this.A02, googleIdTokenRequestOptions.A02) && CS7.A01(this.A03, googleIdTokenRequestOptions.A03) && this.A06 == googleIdTokenRequestOptions.A06;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A04), this.A00, this.A01, Boolean.valueOf(this.A05), this.A02, this.A03, Boolean.valueOf(this.A06)});
        }

        public GoogleIdTokenRequestOptions(String str, List list, String str2, String str3, boolean z, boolean z2, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            CRy.A08(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.A04 = z;
            if (z) {
                CRy.A04(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.A00 = str;
            this.A01 = str2;
            this.A05 = z2;
            ArrayList arrayListA0t = null;
            if (list != null && !list.isEmpty()) {
                arrayListA0t = BV4.A0t(list);
                Collections.sort(arrayListA0t);
            }
            this.A03 = arrayListA0t;
            this.A02 = str3;
            this.A06 = z3;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iA00 = AbstractC4100CmU.A00(parcel);
            AbstractC4100CmU.A08(parcel, 1, this.A04);
            AbstractC4100CmU.A0A(parcel, this.A00, 2);
            AbstractC4100CmU.A0A(parcel, this.A01, 3);
            AbstractC4100CmU.A08(parcel, 4, this.A05);
            AbstractC4100CmU.A0A(parcel, this.A02, 5);
            AbstractC4100CmU.A0B(parcel, this.A03, 6);
            AbstractC4100CmU.A08(parcel, 7, this.A06);
            AbstractC4100CmU.A05(parcel, iA00);
        }
    }

    @Deprecated
    public final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = C4158CoD.A03(10);
        public final String A00;
        public final boolean A01;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PasskeyJsonRequestOptions) {
                    PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
                    if (this.A01 != passkeyJsonRequestOptions.A01 || !CS7.A01(this.A00, passkeyJsonRequestOptions.A00)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return BV7.A0D(Boolean.valueOf(this.A01), this.A00);
        }

        public PasskeyJsonRequestOptions(boolean z, String str) {
            if (z) {
                CRy.A03(str);
            }
            this.A01 = z;
            this.A00 = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iA00 = AbstractC4100CmU.A00(parcel);
            AbstractC4100CmU.A08(parcel, 1, this.A01);
            AbstractC4100CmU.A0A(parcel, this.A00, 2);
            AbstractC4100CmU.A05(parcel, iA00);
        }
    }

    @Deprecated
    public final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = C4158CoD.A03(11);
        public final String A00;
        public final boolean A01;
        public final byte[] A02;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PasskeysRequestOptions) {
                    PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
                    if (this.A01 != passkeysRequestOptions.A01 || !Arrays.equals(this.A02, passkeysRequestOptions.A02) || !C6xC.A00(this.A00, passkeysRequestOptions.A00)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (BV7.A0D(Boolean.valueOf(this.A01), this.A00) * 31) + Arrays.hashCode(this.A02);
        }

        public PasskeysRequestOptions(String str, byte[] bArr, boolean z) {
            if (z) {
                CRy.A03(bArr);
                CRy.A03(str);
            }
            this.A01 = z;
            this.A02 = bArr;
            this.A00 = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iA00 = AbstractC4100CmU.A00(parcel);
            AbstractC4100CmU.A08(parcel, 1, this.A01);
            AbstractC4100CmU.A0D(parcel, this.A02, 2);
            AbstractC4100CmU.A0A(parcel, this.A00, 3);
            AbstractC4100CmU.A05(parcel, iA00);
        }
    }

    @Deprecated
    public final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = C4158CoD.A03(12);
        public final boolean A00;

        public final boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.A00 == ((PasswordRequestOptions) obj).A00;
        }

        public final int hashCode() {
            return Arrays.hashCode(BV4.A1Z(this.A00));
        }

        public PasswordRequestOptions(boolean z) {
            this.A00 = z;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iA00 = AbstractC4100CmU.A00(parcel);
            AbstractC4100CmU.A08(parcel, 1, this.A00);
            AbstractC4100CmU.A05(parcel, iA00);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return CS7.A01(this.A04, beginSignInRequest.A04) && CS7.A01(this.A01, beginSignInRequest.A01) && CS7.A01(this.A03, beginSignInRequest.A03) && CS7.A01(this.A02, beginSignInRequest.A02) && CS7.A01(this.A05, beginSignInRequest.A05) && this.A06 == beginSignInRequest.A06 && this.A00 == beginSignInRequest.A00 && this.A07 == beginSignInRequest.A07;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A01, this.A03, this.A02, this.A05, Boolean.valueOf(this.A06), Integer.valueOf(this.A00), Boolean.valueOf(this.A07)});
    }

    public BeginSignInRequest(GoogleIdTokenRequestOptions googleIdTokenRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, PasskeysRequestOptions passkeysRequestOptions, PasswordRequestOptions passwordRequestOptions, String str, int i, boolean z, boolean z2) {
        CRy.A03(passwordRequestOptions);
        this.A04 = passwordRequestOptions;
        CRy.A03(googleIdTokenRequestOptions);
        this.A01 = googleIdTokenRequestOptions;
        this.A05 = str;
        this.A06 = z;
        this.A00 = i;
        this.A03 = passkeysRequestOptions == null ? new PasskeysRequestOptions(null, null, false) : passkeysRequestOptions;
        this.A02 = passkeyJsonRequestOptions == null ? new PasskeyJsonRequestOptions(false, null) : passkeyJsonRequestOptions;
        this.A07 = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A09(parcel, this.A04, 1, i);
        AbstractC4100CmU.A09(parcel, this.A01, 2, i);
        AbstractC4100CmU.A0A(parcel, this.A05, 3);
        AbstractC4100CmU.A08(parcel, 4, this.A06);
        AbstractC4100CmU.A06(parcel, 5, this.A00);
        AbstractC4100CmU.A09(parcel, this.A03, 6, i);
        AbstractC4100CmU.A09(parcel, this.A02, 7, i);
        AbstractC4100CmU.A08(parcel, 8, this.A07);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
