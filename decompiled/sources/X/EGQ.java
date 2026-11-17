package X;

import android.graphics.HardwareRenderer;
import android.graphics.RenderNode;
import android.media.Image;
import android.media.ImageReader;

/* loaded from: classes5.dex */
public final class EGQ {
    public int A00;
    public int A01;
    public HardwareRenderer A02;
    public RenderNode A03;
    public RenderNode A04;
    public Image A05;
    public Image A06;
    public Image A07;
    public ImageReader A08;
    public boolean A09;

    public final void A00() {
        Image image = this.A06;
        if (image != null) {
            image.close();
        }
        this.A06 = null;
        Image image2 = this.A07;
        if (image2 != null) {
            image2.close();
        }
        this.A07 = null;
        Image image3 = this.A05;
        if (image3 != null) {
            image3.close();
        }
        this.A05 = null;
        RenderNode renderNode = this.A04;
        if (renderNode != null) {
            renderNode.discardDisplayList();
        }
        this.A04 = null;
        RenderNode renderNode2 = this.A03;
        if (renderNode2 != null) {
            renderNode2.discardDisplayList();
        }
        this.A03 = null;
        HardwareRenderer hardwareRenderer = this.A02;
        if (hardwareRenderer != null) {
            hardwareRenderer.destroy();
        }
        this.A02 = null;
        ImageReader imageReader = this.A08;
        if (imageReader != null) {
            imageReader.close();
        }
        this.A08 = null;
        this.A01 = 0;
        this.A00 = 0;
    }
}
