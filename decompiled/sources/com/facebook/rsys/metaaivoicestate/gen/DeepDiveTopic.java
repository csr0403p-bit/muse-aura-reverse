package com.facebook.rsys.metaaivoicestate.gen;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class DeepDiveTopic {
    public static G50<DeepDiveTopic> CONVERTER = C8921Ftd.A00(26);
    public static long sMcfTypeId;
    public final String contentCardId;
    public final Integer sectionIndex;
    public final String title;
    public final String topicId;

    public static native DeepDiveTopic createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeepDiveTopic) {
                DeepDiveTopic deepDiveTopic = (DeepDiveTopic) obj;
                if (this.topicId.equals(deepDiveTopic.topicId) && this.title.equals(deepDiveTopic.title)) {
                    String str = this.contentCardId;
                    String str2 = deepDiveTopic.contentCardId;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        Integer num = this.sectionIndex;
                        Integer num2 = deepDiveTopic.sectionIndex;
                        if (num == null) {
                            if (num2 != null) {
                                return false;
                            }
                        } else if (num.equals(num2)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.title, BV8.A0B(this.topicId)) + AnonymousClass006.A0G(this.contentCardId)) * 31) + C3cH.A02(this.sectionIndex);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DeepDiveTopic{topicId=");
        sbA0x.append(this.topicId);
        sbA0x.append(",title=");
        sbA0x.append(this.title);
        sbA0x.append(",contentCardId=");
        sbA0x.append(this.contentCardId);
        sbA0x.append(",sectionIndex=");
        return BV8.A0v(this.sectionIndex, sbA0x);
    }

    public DeepDiveTopic(String str, String str2, String str3, Integer num) {
        str.getClass();
        str2.getClass();
        this.topicId = str;
        this.title = str2;
        this.contentCardId = str3;
        this.sectionIndex = num;
    }
}
