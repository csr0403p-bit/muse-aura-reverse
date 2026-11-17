package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class MetaAiUserContent {
    public static G50<MetaAiUserContent> CONVERTER = C8921Ftd.A00(40);
    public static long sMcfTypeId;
    public final MetaAiCaption caption;
    public final String otid;

    public static native MetaAiUserContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaAiUserContent) {
                MetaAiUserContent metaAiUserContent = (MetaAiUserContent) obj;
                MetaAiCaption metaAiCaption = this.caption;
                MetaAiCaption metaAiCaption2 = metaAiUserContent.caption;
                if (metaAiCaption != null ? metaAiCaption.equals(metaAiCaption2) : metaAiCaption2 == null) {
                    String str = this.otid;
                    String str2 = metaAiUserContent.otid;
                    if (str == null) {
                        if (str2 != null) {
                            return false;
                        }
                    } else if (str.equals(str2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC7608F5v.A02(AnonymousClass006.A0D(this.caption)) + AnonymousClass005.A0H(this.otid);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("MetaAiUserContent{caption=");
        sbA0x.append(this.caption);
        sbA0x.append(",otid=");
        return AbstractC7610F5x.A0w(this.otid, sbA0x);
    }

    public MetaAiUserContent(MetaAiCaption metaAiCaption, String str) {
        this.caption = metaAiCaption;
        this.otid = str;
    }
}
