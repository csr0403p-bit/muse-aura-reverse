package com.facebook.aura.vds.compose.text.richtext;

import X.AHD;
import X.AHI;
import X.C06G;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.vds.compose.text.richtext.AuraInlineEntityItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class AuraInlineEntities extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final AuraInlineEntities EMPTY = new AuraInlineEntities(AHI.A01);
    public final AHD<AuraInlineEntityItem> items;

    public final class Companion {
        public final AuraInlineEntities getEMPTY() {
            return AuraInlineEntities.EMPTY;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuraInlineEntities(AHD<? extends AuraInlineEntityItem> ahd) {
        C7384Etj.A0Y(ahd, 0);
        this.items = ahd;
    }

    public final AuraInlineEntities copy(AHD<? extends AuraInlineEntityItem> ahd) {
        C7384Etj.A0Y(ahd, 0);
        return new AuraInlineEntities(ahd);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AuraInlineEntities) && C7384Etj.areEqual(this.items, ((AuraInlineEntities) obj).items));
    }

    public final AuraInlineEntityItem getForContentId(String str) {
        Object next;
        C7384Etj.A0Y(str, 0);
        Iterator it = this.items.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (str.equals(((AuraInlineEntityItem) next).getContentId())) {
                break;
            }
        }
        return (AuraInlineEntityItem) next;
    }

    public static /* synthetic */ AuraInlineEntities copy$default(AuraInlineEntities auraInlineEntities, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = auraInlineEntities.items;
        }
        C7384Etj.A0Y(ahd, 0);
        return new AuraInlineEntities(ahd);
    }

    public final AHD<AuraInlineEntityItem> component1() {
        return this.items;
    }

    public final List<AuraInlineEntityItem.Citation> getCitations() {
        AHD<AuraInlineEntityItem> ahd = this.items;
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : ahd) {
            if (obj instanceof AuraInlineEntityItem.Citation) {
                arrayListA0h.add(obj);
            }
        }
        return arrayListA0h;
    }

    public final List<AuraInlineEntityItem.Deeplink> getDeeplinks() {
        AHD<AuraInlineEntityItem> ahd = this.items;
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : ahd) {
            if (obj instanceof AuraInlineEntityItem.Deeplink) {
                arrayListA0h.add(obj);
            }
        }
        return arrayListA0h;
    }

    public final AHD<AuraInlineEntityItem> getItems() {
        return this.items;
    }

    public final List<AuraInlineEntityItem.Latex> getLatex() {
        AHD<AuraInlineEntityItem> ahd = this.items;
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : ahd) {
            if (obj instanceof AuraInlineEntityItem.Latex) {
                arrayListA0h.add(obj);
            }
        }
        return arrayListA0h;
    }

    public final List<AuraInlineEntityItem.PlaceEntity> getPlaceEntities() {
        AHD<AuraInlineEntityItem> ahd = this.items;
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : ahd) {
            if (obj instanceof AuraInlineEntityItem.PlaceEntity) {
                arrayListA0h.add(obj);
            }
        }
        return arrayListA0h;
    }

    public final List<AuraInlineEntityItem.SocialEntity> getSocialEntities() {
        AHD<AuraInlineEntityItem> ahd = this.items;
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : ahd) {
            if (obj instanceof AuraInlineEntityItem.SocialEntity) {
                arrayListA0h.add(obj);
            }
        }
        return arrayListA0h;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
