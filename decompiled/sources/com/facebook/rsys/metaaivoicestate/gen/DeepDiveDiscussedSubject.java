package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7609F5w;
import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class DeepDiveDiscussedSubject {
    public static G50<DeepDiveDiscussedSubject> CONVERTER = C8921Ftd.A00(21);
    public static long sMcfTypeId;
    public final DeepDiveDiscussedSubjectSource source;
    public final int state;
    public final String subjectId;
    public final String title;

    public static native DeepDiveDiscussedSubject createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeepDiveDiscussedSubject) {
                DeepDiveDiscussedSubject deepDiveDiscussedSubject = (DeepDiveDiscussedSubject) obj;
                if (!this.subjectId.equals(deepDiveDiscussedSubject.subjectId) || !this.title.equals(deepDiveDiscussedSubject.title) || this.state != deepDiveDiscussedSubject.state || !this.source.equals(deepDiveDiscussedSubject.source)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.source, (AnonymousClass005.A0I(this.title, BV8.A0B(this.subjectId)) + this.state) * 31);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DeepDiveDiscussedSubject{subjectId=");
        sbA0x.append(this.subjectId);
        sbA0x.append(",title=");
        sbA0x.append(this.title);
        sbA0x.append(",state=");
        sbA0x.append(this.state);
        sbA0x.append(",source=");
        return BV8.A0v(this.source, sbA0x);
    }

    public DeepDiveDiscussedSubject(String str, String str2, int i, DeepDiveDiscussedSubjectSource deepDiveDiscussedSubjectSource) {
        AbstractC7609F5w.A1H(str, str2, deepDiveDiscussedSubjectSource);
        this.subjectId = str;
        this.title = str2;
        this.state = i;
        this.source = deepDiveDiscussedSubjectSource;
    }
}
