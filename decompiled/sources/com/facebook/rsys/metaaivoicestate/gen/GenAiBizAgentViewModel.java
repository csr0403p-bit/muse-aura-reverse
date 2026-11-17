package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class GenAiBizAgentViewModel {
    public static G50<GenAiBizAgentViewModel> CONVERTER = C8921Ftd.A00(27);
    public static long sMcfTypeId;
    public final ArrayList<String> appClientActions;
    public final String feMessage;
    public final byte[] feOmnibotMessage;
    public final ArrayList<String> relatedProductIds;

    public static native GenAiBizAgentViewModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenAiBizAgentViewModel) {
                GenAiBizAgentViewModel genAiBizAgentViewModel = (GenAiBizAgentViewModel) obj;
                if (this.relatedProductIds.equals(genAiBizAgentViewModel.relatedProductIds) && this.appClientActions.equals(genAiBizAgentViewModel.appClientActions)) {
                    byte[] bArr = this.feOmnibotMessage;
                    byte[] bArr2 = genAiBizAgentViewModel.feOmnibotMessage;
                    if (bArr != null ? Arrays.equals(bArr, bArr2) : bArr2 == null) {
                        String str = this.feMessage;
                        String str2 = genAiBizAgentViewModel.feMessage;
                        if (str == null) {
                            if (str2 != null) {
                                return false;
                            }
                        } else if (str.equals(str2)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.appClientActions, BV8.A09(this.relatedProductIds)) + AnonymousClass006.A0D(this.feOmnibotMessage)) * 31) + AnonymousClass005.A0H(this.feMessage);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("GenAiBizAgentViewModel{relatedProductIds=");
        sbA0x.append(this.relatedProductIds);
        sbA0x.append(",appClientActions=");
        sbA0x.append(this.appClientActions);
        sbA0x.append(",feOmnibotMessage=");
        sbA0x.append(this.feOmnibotMessage);
        sbA0x.append(",feMessage=");
        return AbstractC7610F5x.A0w(this.feMessage, sbA0x);
    }

    public GenAiBizAgentViewModel(ArrayList<String> arrayList, ArrayList<String> arrayList2, byte[] bArr, String str) {
        arrayList.getClass();
        arrayList2.getClass();
        this.relatedProductIds = arrayList;
        this.appClientActions = arrayList2;
        this.feOmnibotMessage = bArr;
        this.feMessage = str;
    }
}
