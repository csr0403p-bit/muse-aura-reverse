package com.facebook.aura.maps;

import X.AbstractC0878AGe;
import X.AbstractC2159Azp;
import X.AnonymousClass005;
import X.C07399Vr;
import X.C07409Vs;
import X.C60N;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C7BY;
import X.C7Je;
import X.C7mU;
import X.C8sR;
import X.C8sS;
import X.C9VN;
import X.C9VS;
import X.C9VZ;
import X.C9W4;
import X.C9ZS;
import X.FGI;
import X.InterfaceC07449Vz;
import X.InterfaceC07569Wo;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchPlaceDetailsCallbacks implements C9VZ, InterfaceC07569Wo, C9W4, InterfaceC07449Vz {
    public final String analyticsId;
    public final C9ZS contact;
    public final Context context;
    public final C9VS data;
    public final C9VN details;
    public final Function0<Unit> dismiss;
    public final String placeName;

    public /* bridge */ void onMediaShown(String str) {
    }

    @Override // X.C9W4
    public /* bridge */ void onPhotoClick(String str) {
        C7384Etj.A0Y(str, 1);
        onVideoClick(str);
    }

    @Override // X.C9W4
    public void onVideoClick(String str) {
        C7384Etj.A0Y(str, 0);
        log(HatchComponent.GALLERY);
        open(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dial() {
        String str = this.data.A00.A02;
        if (str != null) {
            Uri uriA01 = null;
            try {
                uriA01 = C7Je.A01(FGI.A0M("tel:", str));
            } catch (SecurityException | UnsupportedOperationException unused) {
            }
            if (uriA01 != null) {
                try {
                    C7mU.A00().A04().A05(this.context, new Intent(C60N.A00(19), uriA01));
                } catch (ActivityNotFoundException unused2) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void log(HatchComponent hatchComponent) {
        HatchMapAnalytics.INSTANCE.logPlaceDetailsClick(hatchComponent, this.analyticsId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void open(String str) {
        if (str == null || C7BY.A0j(str)) {
            return;
        }
        AuraBrowserLauncherKt.openExternalUrl(str, this.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openDirections() {
        String str;
        C07399Vr c07399Vr = this.data.A00;
        Double d = c07399Vr.A00;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            Double d2 = c07399Vr.A01;
            if (d2 != null) {
                double dDoubleValue2 = d2.doubleValue();
                C9VN c9vn = this.details;
                if (c9vn == null || (str = c9vn.A0D) == null || C7BY.A0j(str)) {
                    str = this.placeName;
                }
                String strEncode = Uri.encode(str);
                C7384Etj.A0U(strEncode);
                String strA0z = AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(strEncode, "(", "%28"), ")", "%29");
                StringBuilder sbA0x = C60O.A0x("geo:0,0?q=");
                sbA0x.append(dDoubleValue);
                sbA0x.append(",");
                sbA0x.append(dDoubleValue2);
                sbA0x.append("(");
                Uri uriA01 = null;
                try {
                    uriA01 = C7Je.A01(C60P.A1M(strA0z, ")", sbA0x));
                } catch (SecurityException | UnsupportedOperationException unused) {
                }
                if (uriA01 != null) {
                    try {
                        if (C7mU.A00().A04().A05(this.context, new Intent("android.intent.action.VIEW", uriA01))) {
                            return;
                        }
                    } catch (ActivityNotFoundException unused2) {
                    }
                }
                StringBuilder sbA0x2 = C60O.A0x(C60N.A00(88));
                sbA0x2.append(dDoubleValue);
                sbA0x2.append(",");
                sbA0x2.append(dDoubleValue2);
                AuraBrowserLauncherKt.openExternalUrl(sbA0x2.toString(), this.context);
            }
        }
    }

    @Override // X.C9VZ
    public InterfaceC07569Wo getActions() {
        return this;
    }

    @Override // X.C9VZ
    public C9ZS getContact() {
        return this.contact;
    }

    public /* bridge */ C8sR getEvents() {
        return C8sS.A00;
    }

    @Override // X.C9VZ
    public C9W4 getGallery() {
        return this;
    }

    @Override // X.C9VZ
    public InterfaceC07449Vz getReviews() {
        return this;
    }

    @Override // X.InterfaceC07569Wo
    public void onCallClick() {
        log(HatchComponent.CALL);
        dial();
    }

    @Override // X.InterfaceC07569Wo
    public void onDirectionsClick() {
        log(HatchComponent.DIRECTIONS);
        openDirections();
    }

    public void onDismissRequest() {
        this.dismiss.invoke();
    }

    @Override // X.InterfaceC07449Vz
    public void onReviewClick(int i) {
        HatchMapAnalytics.INSTANCE.logReviewClick(this.analyticsId, i);
        C07409Vs c07409Vs = (C07409Vs) AbstractC0878AGe.A0A(i, this.data.A0A.A00);
        open(c07409Vs != null ? c07409Vs.A03 : null);
    }

    public /* bridge */ void onShareClick() {
    }

    @Override // X.InterfaceC07569Wo
    public void onWebsiteClick() {
        log(HatchComponent.WEBSITE);
        open(this.data.A00.A03);
    }

    public /* bridge */ void onWhatsAppClick() {
    }

    public HatchPlaceDetailsCallbacks(Context context, String str, String str2, C9VS c9vs, C9VN c9vn, Function0<Unit> function0) {
        AnonymousClass005.A14(context, str, str2, c9vs);
        C7384Etj.A0Y(function0, 5);
        this.context = context;
        this.analyticsId = str;
        this.placeName = str2;
        this.data = c9vs;
        this.details = c9vn;
        this.dismiss = function0;
        this.contact = new C9ZS() { // from class: com.facebook.aura.maps.HatchPlaceDetailsCallbacks$contact$1
            @Override // X.C9ZS
            public void onAddressClick() {
                this.this$0.log(HatchComponent.CONTACT_INFO_ADDRESS);
                this.this$0.openDirections();
            }

            @Override // X.C9ZS
            public void onFacebookClick() {
                HatchPlaceDetailsCallbacks hatchPlaceDetailsCallbacks = this.this$0;
                C9VN c9vn2 = hatchPlaceDetailsCallbacks.details;
                hatchPlaceDetailsCallbacks.open(c9vn2 != null ? c9vn2.A06 : null);
            }

            @Override // X.C9ZS
            public void onInstagramClick() {
                HatchPlaceDetailsCallbacks hatchPlaceDetailsCallbacks = this.this$0;
                C9VN c9vn2 = hatchPlaceDetailsCallbacks.details;
                hatchPlaceDetailsCallbacks.open(c9vn2 != null ? c9vn2.A08 : null);
            }

            public /* bridge */ void onInstagramExploreClick() {
            }

            @Override // X.C9ZS
            public void onPhoneClick() {
                this.this$0.log(HatchComponent.CONTACT_INFO_PHONE);
                this.this$0.dial();
            }

            @Override // X.C9ZS
            public void onWebsiteClick() {
                this.this$0.log(HatchComponent.CONTACT_INFO_WEBSITE);
                HatchPlaceDetailsCallbacks hatchPlaceDetailsCallbacks = this.this$0;
                hatchPlaceDetailsCallbacks.open(hatchPlaceDetailsCallbacks.data.A00.A03);
            }
        };
    }
}
