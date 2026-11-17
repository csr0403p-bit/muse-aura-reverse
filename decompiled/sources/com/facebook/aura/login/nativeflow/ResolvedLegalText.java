package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.linktext.HatchTextLink;
import java.util.List;

/* loaded from: classes.dex */
public final class ResolvedLegalText extends C06G {
    public final List<LegalEmphasis> emphases;
    public final List<HatchTextLink> links;
    public final String text;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ResolvedLegalText) {
                ResolvedLegalText resolvedLegalText = (ResolvedLegalText) obj;
                if (!C7384Etj.areEqual(this.text, resolvedLegalText.text) || !C7384Etj.areEqual(this.links, resolvedLegalText.links) || !C7384Etj.areEqual(this.emphases, resolvedLegalText.emphases)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResolvedLegalText copy$default(ResolvedLegalText resolvedLegalText, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resolvedLegalText.text;
        }
        if ((i & 2) != 0) {
            list = resolvedLegalText.links;
        }
        if ((i & 4) != 0) {
            list2 = resolvedLegalText.emphases;
        }
        return resolvedLegalText.copy(str, list, list2);
    }

    public final String component1() {
        return this.text;
    }

    public final List<HatchTextLink> component2() {
        return this.links;
    }

    public final List<LegalEmphasis> component3() {
        return this.emphases;
    }

    public final List<LegalEmphasis> getEmphases() {
        return this.emphases;
    }

    public final List<HatchTextLink> getLinks() {
        return this.links;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.emphases, AnonymousClass005.A0F(this.links, AnonymousClass001.A0G(this.text)));
    }

    public ResolvedLegalText(String str, List<HatchTextLink> list, List<LegalEmphasis> list2) {
        AnonymousClass005.A0x(str, list, list2);
        this.text = str;
        this.links = list;
        this.emphases = list2;
    }

    public final ResolvedLegalText copy(String str, List<HatchTextLink> list, List<LegalEmphasis> list2) {
        AnonymousClass005.A0x(str, list, list2);
        return new ResolvedLegalText(str, list, list2);
    }

    public String toString() {
        return super.toString();
    }
}
