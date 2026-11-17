package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ImageOptionsWidgetData extends C06G implements HatchWidgetData {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final List<String> imageIds;
    public final List<String> images;
    public final boolean multiSelect;

    public final class Companion {
        public final C9hr<ImageOptionsWidgetData> serializer() {
            return ImageOptionsWidgetData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{AbstractC5321DgF.A02(num, ImageOptionsWidgetData$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, ImageOptionsWidgetData$Companion$$childSerializers$2.INSTANCE), null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ImageOptionsWidgetData) {
                ImageOptionsWidgetData imageOptionsWidgetData = (ImageOptionsWidgetData) obj;
                if (!C7384Etj.areEqual(this.images, imageOptionsWidgetData.images) || !C7384Etj.areEqual(this.imageIds, imageOptionsWidgetData.imageIds) || this.multiSelect != imageOptionsWidgetData.multiSelect) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageOptionsWidgetData copy$default(ImageOptionsWidgetData imageOptionsWidgetData, List list, List list2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = imageOptionsWidgetData.images;
        }
        if ((i & 2) != 0) {
            list2 = imageOptionsWidgetData.imageIds;
        }
        if ((i & 4) != 0) {
            z = imageOptionsWidgetData.multiSelect;
        }
        return imageOptionsWidgetData.copy(list, list2, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ImageOptionsWidgetData imageOptionsWidgetData, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAQ(imageOptionsWidgetData.images, C3cH.A15(f0cArr, 0), c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(imageOptionsWidgetData.imageIds)) {
            c9j5.AAQ(imageOptionsWidgetData.imageIds, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || imageOptionsWidgetData.multiSelect) {
            c9j5.AA7(c9iZ, 2, imageOptionsWidgetData.multiSelect);
        }
    }

    public final List<String> component1() {
        return this.images;
    }

    public final List<String> component2() {
        return this.imageIds;
    }

    public final boolean component3() {
        return this.multiSelect;
    }

    public final List<String> getImageIds() {
        return this.imageIds;
    }

    public final List<String> getImages() {
        return this.images;
    }

    public final boolean getMultiSelect() {
        return this.multiSelect;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.imageIds, AnonymousClass005.A0E(this.images)), this.multiSelect);
    }

    public ImageOptionsWidgetData(List<String> list, List<String> list2, boolean z) {
        AnonymousClass003.A0u(list, list2);
        this.images = list;
        this.imageIds = list2;
        this.multiSelect = z;
    }

    public final ImageOptionsWidgetData copy(List<String> list, List<String> list2, boolean z) {
        AnonymousClass003.A0u(list, list2);
        return new ImageOptionsWidgetData(list, list2, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ImageOptionsWidgetData(int i, List list, List list2, boolean z, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ImageOptionsWidgetData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.images = list;
        if ((i & 2) == 0) {
            this.imageIds = C0881AGi.A00;
        } else {
            this.imageIds = list2;
        }
        if ((i & 4) == 0) {
            this.multiSelect = false;
        } else {
            this.multiSelect = z;
        }
    }

    public /* synthetic */ ImageOptionsWidgetData(List list, List list2, boolean z, int i, C06H c06h) {
        this(list, C3cI.A11(list2, i), AnonymousClass005.A1O(i, z));
    }
}
