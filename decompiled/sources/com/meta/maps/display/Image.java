package com.meta.maps.display;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cG;
import X.C60R;
import X.C6xC;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes4.dex */
public final class Image {
    public final long channels;
    public final ImageContent content;
    public final byte[] data;
    public final long height;
    public final float pixelRatio;
    public final boolean sdf;
    public final List<ImageStretch> stretchX;
    public final List<ImageStretch> stretchY;
    public final long width;

    public Image(long j, long j2, long j3, float f, byte[] bArr, boolean z, List<ImageStretch> list, List<ImageStretch> list2, ImageContent imageContent) {
        C7384Etj.A0Y(bArr, 4);
        AnonymousClass003.A10(list, list2);
        this.width = j;
        this.height = j2;
        this.channels = j3;
        this.pixelRatio = f;
        this.data = bArr;
        this.sdf = z;
        this.stretchX = list;
        this.stretchY = list2;
        this.content = imageContent;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Image) {
                Image image = (Image) obj;
                if (this.width != image.width || this.height != image.height || this.channels != image.channels || Float.compare(this.pixelRatio, image.pixelRatio) != 0 || !C6xC.A00(this.data, image.data) || this.sdf != image.sdf || !C6xC.A00(this.stretchX, image.stretchX) || !C6xC.A00(this.stretchY, image.stretchY) || !C6xC.A00(this.content, image.content)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iA06 = AnonymousClass006.A06(this.height, (217 + C3cG.A02(this.width)) * 31);
        long j = this.channels;
        return AnonymousClass005.A0F(this.stretchY, AnonymousClass005.A0F(this.stretchX, (((AnonymousClass005.A02((iA06 + ((int) ((j >>> 32) ^ j))) * 31, this.pixelRatio) + this.data.hashCode()) * 31) + (this.sdf ? 79 : 97)) * 31)) + C60R.A01(this.content);
    }

    public Image(long j, long j2, long j3, float f, byte[] bArr) {
        C7384Etj.A0Y(bArr, 4);
        this.width = j;
        this.height = j2;
        this.channels = j3;
        this.pixelRatio = f;
        this.data = bArr;
        this.sdf = false;
        this.stretchX = C3cG.A0h();
        this.stretchY = C3cG.A0h();
        this.content = null;
    }
}
