package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7608F5v;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class PsiToolRequest {
    public static G50<PsiToolRequest> CONVERTER = C8921Ftd.A00(47);
    public static long sMcfTypeId;
    public final PsiToolQueryPlan psiToolQueryPlan;
    public final String requestId;
    public final String turnId;

    public static native PsiToolRequest createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PsiToolRequest) {
                PsiToolRequest psiToolRequest = (PsiToolRequest) obj;
                String str = this.turnId;
                String str2 = psiToolRequest.turnId;
                if (str != null ? str.equals(str2) : str2 == null) {
                    String str3 = this.requestId;
                    String str4 = psiToolRequest.requestId;
                    if (str3 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (str3.equals(str4)) {
                    }
                    PsiToolQueryPlan psiToolQueryPlan = this.psiToolQueryPlan;
                    PsiToolQueryPlan psiToolQueryPlan2 = psiToolRequest.psiToolQueryPlan;
                    if (psiToolQueryPlan == null) {
                        if (psiToolQueryPlan2 != null) {
                            return false;
                        }
                    } else if (psiToolQueryPlan.equals(psiToolQueryPlan2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AbstractC7608F5v.A02(AnonymousClass006.A0G(this.turnId)) + AnonymousClass006.A0G(this.requestId)) * 31) + C3cH.A02(this.psiToolQueryPlan);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("PsiToolRequest{turnId=");
        sbA0x.append(this.turnId);
        sbA0x.append(",requestId=");
        sbA0x.append(this.requestId);
        sbA0x.append(",psiToolQueryPlan=");
        return BV8.A0v(this.psiToolQueryPlan, sbA0x);
    }

    public PsiToolRequest(String str, String str2, PsiToolQueryPlan psiToolQueryPlan) {
        this.turnId = str;
        this.requestId = str2;
        this.psiToolQueryPlan = psiToolQueryPlan;
    }
}
