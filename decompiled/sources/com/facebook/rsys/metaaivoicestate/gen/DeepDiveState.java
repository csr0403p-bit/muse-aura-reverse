package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public class DeepDiveState {
    public static G50<DeepDiveState> CONVERTER = C8921Ftd.A00(25);
    public static long sMcfTypeId;
    public final DeepDivePlaybackSection currentSection;
    public final ArrayList<DeepDiveDiscussedSubject> discussedSubjects;
    public final Map<String, String> postDisplayTitles;
    public final ArrayList<DeepDiveSnapshot> snapshots;

    public static native DeepDiveState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeepDiveState) {
                DeepDiveState deepDiveState = (DeepDiveState) obj;
                DeepDivePlaybackSection deepDivePlaybackSection = this.currentSection;
                DeepDivePlaybackSection deepDivePlaybackSection2 = deepDiveState.currentSection;
                if (deepDivePlaybackSection != null ? deepDivePlaybackSection.equals(deepDivePlaybackSection2) : deepDivePlaybackSection2 == null) {
                    if (!this.discussedSubjects.equals(deepDiveState.discussedSubjects) || !this.snapshots.equals(deepDiveState.snapshots) || !this.postDisplayTitles.equals(deepDiveState.postDisplayTitles)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.snapshots, AnonymousClass005.A0F(this.discussedSubjects, AbstractC7608F5v.A02(AnonymousClass006.A0D(this.currentSection)))) + this.postDisplayTitles.hashCode();
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DeepDiveState{currentSection=");
        sbA0x.append(this.currentSection);
        sbA0x.append(",discussedSubjects=");
        sbA0x.append(this.discussedSubjects);
        sbA0x.append(",snapshots=");
        sbA0x.append(this.snapshots);
        sbA0x.append(",postDisplayTitles=");
        return BV8.A0v(this.postDisplayTitles, sbA0x);
    }

    public DeepDiveState(DeepDivePlaybackSection deepDivePlaybackSection, ArrayList<DeepDiveDiscussedSubject> arrayList, ArrayList<DeepDiveSnapshot> arrayList2, Map<String, String> map) {
        AbstractC7609F5w.A1H(arrayList, arrayList2, map);
        this.currentSection = deepDivePlaybackSection;
        this.discussedSubjects = arrayList;
        this.snapshots = arrayList2;
        this.postDisplayTitles = map;
    }
}
