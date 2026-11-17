package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7609F5w;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BV8;
import X.C8921Ftd;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class MetaAiCaption {
    public static G50<MetaAiCaption> CONVERTER = C8921Ftd.A00(33);
    public static long sMcfTypeId;
    public final String captionTimestamps;
    public final String language;
    public final String text;

    public static native MetaAiCaption createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaAiCaption) {
                MetaAiCaption metaAiCaption = (MetaAiCaption) obj;
                if (!this.text.equals(metaAiCaption.text) || !this.language.equals(metaAiCaption.language) || !this.captionTimestamps.equals(metaAiCaption.captionTimestamps)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.captionTimestamps, AnonymousClass005.A0I(this.language, BV8.A0B(this.text)));
    }

    public String toString() {
        return FGI.A0k("MetaAiCaption{text=", this.text, ",language=", this.language, ",captionTimestamps=", this.captionTimestamps, "}");
    }

    public MetaAiCaption(String str, String str2, String str3) {
        AbstractC7609F5w.A1H(str, str2, str3);
        this.text = str;
        this.language = str2;
        this.captionTimestamps = str3;
    }
}
