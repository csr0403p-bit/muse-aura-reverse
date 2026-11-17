package com.facebook.aura.activation.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.activation.data.HatchUpsellCell;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class TosUpsellCellJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String subtitle;
    public final String title;

    public final class Companion {
        public final C9hr<TosUpsellCellJson> serializer() {
            return TosUpsellCellJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo(TosUpsellCellJson tosUpsellCellJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(tosUpsellCellJson.title)) {
            c9j5.AAV(tosUpsellCellJson.title, c9iZ, 0);
        }
        if (zAfR || !"".equals(tosUpsellCellJson.subtitle)) {
            c9j5.AAV(tosUpsellCellJson.subtitle, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TosUpsellCellJson) {
                TosUpsellCellJson tosUpsellCellJson = (TosUpsellCellJson) obj;
                if (!C7384Etj.areEqual(this.title, tosUpsellCellJson.title) || !C7384Etj.areEqual(this.subtitle, tosUpsellCellJson.subtitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TosUpsellCellJson copy$default(TosUpsellCellJson tosUpsellCellJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tosUpsellCellJson.title;
        }
        if ((i & 2) != 0) {
            str2 = tosUpsellCellJson.subtitle;
        }
        AnonymousClass003.A0u(str, str2);
        return new TosUpsellCellJson(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.subtitle, AnonymousClass001.A0G(this.title));
    }

    public final HatchUpsellCell toDomain() {
        if (C7BY.A0j(this.title) || C7BY.A0j(this.subtitle)) {
            return null;
        }
        return new HatchUpsellCell(this.title, this.subtitle);
    }

    public TosUpsellCellJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.title = str;
        this.subtitle = str2;
    }

    public final TosUpsellCellJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new TosUpsellCellJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TosUpsellCellJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str2;
        }
    }

    public /* synthetic */ TosUpsellCellJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public TosUpsellCellJson() {
        this("", "");
    }
}
