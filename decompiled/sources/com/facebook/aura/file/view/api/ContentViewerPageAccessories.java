package com.facebook.aura.file.view.api;

import X.A6B;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.C2308BTi;
import X.G0U;
import com.facebook.aura.model.HatchAttachmentFile;
import com.facebook.aura.productactions.lightbox.FeaturedProductLightboxAccessoryProducer;

/* loaded from: classes4.dex */
public final class ContentViewerPageAccessories {
    public static final int $stable = 0;
    public static final ContentViewerPageAccessories INSTANCE = new ContentViewerPageAccessories();

    /* renamed from: com.facebook.aura.file.view.api.ContentViewerPageAccessories$accessoryFor$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, ContentViewerPageAccessory> {
        public final /* synthetic */ ContentViewerPageContext $context;
        public final /* synthetic */ HatchAttachmentFile $image;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchAttachmentFile hatchAttachmentFile, ContentViewerPageContext contentViewerPageContext) {
            super(1);
            this.$image = hatchAttachmentFile;
            this.$context = contentViewerPageContext;
        }

        public final ContentViewerPageAccessory invoke(int i) {
            HatchAttachmentFile hatchAttachmentFile = this.$image;
            ContentViewerPageContext contentViewerPageContext = this.$context;
            if (i == 0) {
                return FeaturedProductLightboxAccessoryProducer.INSTANCE.accessoryFor(hatchAttachmentFile, contentViewerPageContext);
            }
            throw AnonymousClass005.A0c(i);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ ContentViewerPageAccessory invoke(Integer num) {
            return invoke(AnonymousClass001.A0F(num));
        }
    }

    public final ContentViewerPageAccessory accessoryFor(HatchAttachmentFile hatchAttachmentFile, ContentViewerPageContext contentViewerPageContext) {
        int iA1b = AnonymousClass004.A1b(hatchAttachmentFile, contentViewerPageContext);
        return (ContentViewerPageAccessory) A6B.A00(A6B.A04(new AnonymousClass1(hatchAttachmentFile, contentViewerPageContext), new C2308BTi(new int[]{iA1b}, iA1b)));
    }
}
