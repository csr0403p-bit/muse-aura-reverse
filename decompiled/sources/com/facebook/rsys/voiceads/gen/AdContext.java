package com.facebook.rsys.voiceads.gen;

import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8924Ftg;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class AdContext {
    public static G50<AdContext> CONVERTER = new C8924Ftg(10);
    public static long sMcfTypeId;
    public final String adId;
    public final String conversationStarterPrompt;
    public final String conversationStarterResponse;
    public final ArrayList<String> pillProductIds;
    public final ArrayList<String> productIds;

    public static native AdContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AdContext) {
                AdContext adContext = (AdContext) obj;
                if (this.adId.equals(adContext.adId)) {
                    String str = this.conversationStarterPrompt;
                    String str2 = adContext.conversationStarterPrompt;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        String str3 = this.conversationStarterResponse;
                        String str4 = adContext.conversationStarterResponse;
                        if (str3 == null) {
                            if (str4 != null) {
                                return false;
                            }
                        } else if (str3.equals(str4)) {
                        }
                        ArrayList<String> arrayList = this.productIds;
                        ArrayList<String> arrayList2 = adContext.productIds;
                        if (arrayList == null) {
                            if (arrayList2 != null) {
                                return false;
                            }
                        } else if (arrayList.equals(arrayList2)) {
                        }
                        ArrayList<String> arrayList3 = this.pillProductIds;
                        ArrayList<String> arrayList4 = adContext.pillProductIds;
                        if (arrayList3 == null) {
                            if (arrayList4 != null) {
                                return false;
                            }
                        } else if (arrayList3.equals(arrayList4)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((BV8.A0B(this.adId) + AnonymousClass006.A0G(this.conversationStarterPrompt)) * 31) + AnonymousClass006.A0G(this.conversationStarterResponse)) * 31) + AnonymousClass006.A0D(this.productIds)) * 31) + C3cH.A02(this.pillProductIds);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("AdContext{adId=");
        sbA0x.append(this.adId);
        sbA0x.append(",conversationStarterPrompt=");
        sbA0x.append(this.conversationStarterPrompt);
        sbA0x.append(",conversationStarterResponse=");
        sbA0x.append(this.conversationStarterResponse);
        sbA0x.append(",productIds=");
        sbA0x.append(this.productIds);
        sbA0x.append(",pillProductIds=");
        return BV8.A0v(this.pillProductIds, sbA0x);
    }

    public AdContext(String str, String str2, String str3, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        str.getClass();
        this.adId = str;
        this.conversationStarterPrompt = str2;
        this.conversationStarterResponse = str3;
        this.productIds = arrayList;
        this.pillProductIds = arrayList2;
    }
}
