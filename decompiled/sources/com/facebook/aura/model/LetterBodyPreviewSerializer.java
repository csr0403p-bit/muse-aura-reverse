package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import X.FGI;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public final class LetterBodyPreviewSerializer implements C9hr<LetterBodyPreview> {
    public static final int $stable = 0;
    public static final LetterBodyPreviewSerializer INSTANCE = new LetterBodyPreviewSerializer();
    public static final C9iZ descriptor = LetterBodyPreviewSerializer$Surrogate$$serializer.descriptor;

    @Serializable
    public final class Surrogate extends C06G {
        public static final Companion Companion = new Companion();
        public final LetterBodyPreviewImage image;
        public final String type;

        public final class Companion {
            public final C9hr<Surrogate> serializer() {
                return LetterBodyPreviewSerializer$Surrogate$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public Surrogate(String str, LetterBodyPreviewImage letterBodyPreviewImage) {
            C7384Etj.A0Y(str, 0);
            this.type = str;
            this.image = letterBodyPreviewImage;
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(Surrogate surrogate, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAV(surrogate.type, c9iZ, 0);
            if (c9j5.AfR() || surrogate.image != null) {
                c9j5.AAP(surrogate.image, LetterBodyPreviewImage$$serializer.INSTANCE, c9iZ, 1);
            }
        }

        public final Surrogate copy(String str, LetterBodyPreviewImage letterBodyPreviewImage) {
            C7384Etj.A0Y(str, 0);
            return new Surrogate(str, letterBodyPreviewImage);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Surrogate) {
                    Surrogate surrogate = (Surrogate) obj;
                    if (!C7384Etj.areEqual(this.type, surrogate.type) || !C7384Etj.areEqual(this.image, surrogate.image)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, LetterBodyPreviewImage letterBodyPreviewImage, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.type;
            }
            if ((i & 2) != 0) {
                letterBodyPreviewImage = surrogate.image;
            }
            C7384Etj.A0Y(str, 0);
            return new Surrogate(str, letterBodyPreviewImage);
        }

        public final String component1() {
            return this.type;
        }

        public final LetterBodyPreviewImage component2() {
            return this.image;
        }

        public final LetterBodyPreviewImage getImage() {
            return this.image;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.type) + AnonymousClass006.A0D(this.image);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Surrogate(int i, String str, LetterBodyPreviewImage letterBodyPreviewImage, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(LetterBodyPreviewSerializer$Surrogate$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.type = str;
            this.image = (i & 2) == 0 ? null : letterBodyPreviewImage;
        }

        public /* synthetic */ Surrogate(String str, LetterBodyPreviewImage letterBodyPreviewImage, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : letterBodyPreviewImage);
        }
    }

    @Override // X.C9jG
    public LetterBodyPreview deserialize(InterfaceC07829iw interfaceC07829iw) {
        LetterBodyPreviewImage letterBodyPreviewImage;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        Surrogate surrogate = (Surrogate) interfaceC07829iw.A8b(LetterBodyPreviewSerializer$Surrogate$$serializer.INSTANCE);
        String str = surrogate.type;
        if (!"image".equals(str) || (letterBodyPreviewImage = surrogate.image) == null) {
            throw new SerializationException(FGI.A0M("Unknown letter body preview type: ", str));
        }
        return letterBodyPreviewImage;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9hv
    public void serialize(InterfaceC07789is interfaceC07789is, LetterBodyPreview letterBodyPreview) {
        AnonymousClass003.A0u(interfaceC07789is, letterBodyPreview);
        if (!(letterBodyPreview instanceof LetterBodyPreviewImage)) {
            throw C3cG.A0q();
        }
        interfaceC07789is.AAR(new Surrogate("image", (LetterBodyPreviewImage) letterBodyPreview), LetterBodyPreviewSerializer$Surrogate$$serializer.INSTANCE);
    }
}
