package com.facebook.aura.markdown.parser.ast;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cI;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes4.dex */
public interface AuraInline {

    public final class AutoLink implements AuraInline {
        public final String url;

        public AutoLink(String str) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
        }

        public final AutoLink copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new AutoLink(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof AutoLink) && C7384Etj.areEqual(this.url, ((AutoLink) obj).url));
        }

        public static /* synthetic */ AutoLink copy$default(AutoLink autoLink, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = autoLink.url;
            }
            C7384Etj.A0Y(str, 0);
            return new AutoLink(str);
        }

        public final String component1() {
            return this.url;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return C60O.A0r("AutoLink(url=", this.url);
        }
    }

    public final class Custom implements AuraInline {
        public final String name;
        public final Object payload;

        public Custom(String str, Object obj) {
            C7384Etj.A0Y(str, 0);
            this.name = str;
            this.payload = obj;
        }

        public final Custom copy(String str, Object obj) {
            C7384Etj.A0Y(str, 0);
            return new Custom(str, obj);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Custom) {
                    Custom custom = (Custom) obj;
                    if (!C7384Etj.areEqual(this.name, custom.name) || !C7384Etj.areEqual(this.payload, custom.payload)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Custom copy$default(Custom custom, String str, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = custom.name;
            }
            if ((i & 2) != 0) {
                obj = custom.payload;
            }
            C7384Etj.A0Y(str, 0);
            return new Custom(str, obj);
        }

        public final String component1() {
            return this.name;
        }

        public final Object component2() {
            return this.payload;
        }

        public final String getName() {
            return this.name;
        }

        public final Object getPayload() {
            return this.payload;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.name) + AnonymousClass006.A0D(this.payload);
        }

        public String toString() {
            return C3cJ.A0L(this.payload, ", payload=", C3cI.A0x("Custom(name=", this.name));
        }
    }

    public final class Emphasis implements AuraInline {
        public final AHD<AuraInline> children;

        /* JADX WARN: Multi-variable type inference failed */
        public Emphasis(AHD<? extends AuraInline> ahd) {
            C7384Etj.A0Y(ahd, 0);
            this.children = ahd;
        }

        public final Emphasis copy(AHD<? extends AuraInline> ahd) {
            C7384Etj.A0Y(ahd, 0);
            return new Emphasis(ahd);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Emphasis) && C7384Etj.areEqual(this.children, ((Emphasis) obj).children));
        }

        public static /* synthetic */ Emphasis copy$default(Emphasis emphasis, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = emphasis.children;
            }
            C7384Etj.A0Y(ahd, 0);
            return new Emphasis(ahd);
        }

        public final AHD<AuraInline> component1() {
            return this.children;
        }

        public final AHD<AuraInline> getChildren() {
            return this.children;
        }

        public int hashCode() {
            return this.children.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Emphasis(children=", this.children);
        }
    }

    public final class Image implements AuraInline {
        public final String alt;
        public final String title;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Image) {
                    Image image = (Image) obj;
                    if (!C7384Etj.areEqual(this.url, image.url) || !C7384Etj.areEqual(this.alt, image.alt) || !C7384Etj.areEqual(this.title, image.title)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Image copy$default(Image image, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = image.url;
            }
            if ((i & 2) != 0) {
                str2 = image.alt;
            }
            if ((i & 4) != 0) {
                str3 = image.title;
            }
            return image.copy(str, str2, str3);
        }

        public final String component1() {
            return this.url;
        }

        public final String component2() {
            return this.alt;
        }

        public final String component3() {
            return this.title;
        }

        public final String getAlt() {
            return this.alt;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.alt, AnonymousClass001.A0G(this.url)) + AnonymousClass006.A0G(this.title);
        }

        public String toString() {
            return FGI.A0k("Image(url=", this.url, ", alt=", this.alt, ", title=", this.title, ")");
        }

        public Image(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            this.url = str;
            this.alt = str2;
            this.title = str3;
        }

        public final Image copy(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            return new Image(str, str2, str3);
        }
    }

    public final class InlineCode implements AuraInline {
        public final String code;

        public InlineCode(String str) {
            C7384Etj.A0Y(str, 0);
            this.code = str;
        }

        public final InlineCode copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new InlineCode(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof InlineCode) && C7384Etj.areEqual(this.code, ((InlineCode) obj).code));
        }

        public static /* synthetic */ InlineCode copy$default(InlineCode inlineCode, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = inlineCode.code;
            }
            C7384Etj.A0Y(str, 0);
            return new InlineCode(str);
        }

        public final String component1() {
            return this.code;
        }

        public final String getCode() {
            return this.code;
        }

        public int hashCode() {
            return this.code.hashCode();
        }

        public String toString() {
            return C60O.A0r("InlineCode(code=", this.code);
        }
    }

    public final class LineBreak implements AuraInline {
        public static final LineBreak INSTANCE = new LineBreak();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof LineBreak);
        }

        public String toString() {
            return "LineBreak";
        }

        public int hashCode() {
            return -1824548923;
        }
    }

    public final class Link implements AuraInline {
        public final AHD<AuraInline> children;
        public final String title;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Link) {
                    Link link = (Link) obj;
                    if (!C7384Etj.areEqual(this.url, link.url) || !C7384Etj.areEqual(this.title, link.title) || !C7384Etj.areEqual(this.children, link.children)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Link copy$default(Link link, String str, String str2, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                str = link.url;
            }
            if ((i & 2) != 0) {
                str2 = link.title;
            }
            if ((i & 4) != 0) {
                ahd = link.children;
            }
            return link.copy(str, str2, ahd);
        }

        public final String component1() {
            return this.url;
        }

        public final String component2() {
            return this.title;
        }

        public final AHD<AuraInline> component3() {
            return this.children;
        }

        public final AHD<AuraInline> getChildren() {
            return this.children;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.children, (AnonymousClass001.A0G(this.url) + AnonymousClass006.A0G(this.title)) * 31);
        }

        public String toString() {
            String str = this.url;
            String str2 = this.title;
            AHD<AuraInline> ahd = this.children;
            StringBuilder sbA0x = C3cI.A0x("Link(url=", str);
            sbA0x.append(", title=");
            sbA0x.append(str2);
            return C3cJ.A0L(ahd, ", children=", sbA0x);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Link(String str, String str2, AHD<? extends AuraInline> ahd) {
            AnonymousClass003.A0v(str, ahd);
            this.url = str;
            this.title = str2;
            this.children = ahd;
        }

        public final Link copy(String str, String str2, AHD<? extends AuraInline> ahd) {
            AnonymousClass003.A0v(str, ahd);
            return new Link(str, str2, ahd);
        }
    }

    public final class SoftLineBreak implements AuraInline {
        public static final SoftLineBreak INSTANCE = new SoftLineBreak();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SoftLineBreak);
        }

        public String toString() {
            return "SoftLineBreak";
        }

        public int hashCode() {
            return -1745087045;
        }
    }

    public final class Strikethrough implements AuraInline {
        public final AHD<AuraInline> children;

        /* JADX WARN: Multi-variable type inference failed */
        public Strikethrough(AHD<? extends AuraInline> ahd) {
            C7384Etj.A0Y(ahd, 0);
            this.children = ahd;
        }

        public final Strikethrough copy(AHD<? extends AuraInline> ahd) {
            C7384Etj.A0Y(ahd, 0);
            return new Strikethrough(ahd);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Strikethrough) && C7384Etj.areEqual(this.children, ((Strikethrough) obj).children));
        }

        public static /* synthetic */ Strikethrough copy$default(Strikethrough strikethrough, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = strikethrough.children;
            }
            C7384Etj.A0Y(ahd, 0);
            return new Strikethrough(ahd);
        }

        public final AHD<AuraInline> component1() {
            return this.children;
        }

        public final AHD<AuraInline> getChildren() {
            return this.children;
        }

        public int hashCode() {
            return this.children.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Strikethrough(children=", this.children);
        }
    }

    public final class Strong implements AuraInline {
        public final AHD<AuraInline> children;

        /* JADX WARN: Multi-variable type inference failed */
        public Strong(AHD<? extends AuraInline> ahd) {
            C7384Etj.A0Y(ahd, 0);
            this.children = ahd;
        }

        public final Strong copy(AHD<? extends AuraInline> ahd) {
            C7384Etj.A0Y(ahd, 0);
            return new Strong(ahd);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Strong) && C7384Etj.areEqual(this.children, ((Strong) obj).children));
        }

        public static /* synthetic */ Strong copy$default(Strong strong, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = strong.children;
            }
            C7384Etj.A0Y(ahd, 0);
            return new Strong(ahd);
        }

        public final AHD<AuraInline> component1() {
            return this.children;
        }

        public final AHD<AuraInline> getChildren() {
            return this.children;
        }

        public int hashCode() {
            return this.children.hashCode();
        }

        public String toString() {
            return C3cJ.A0M("Strong(children=", this.children);
        }
    }

    public final class Text implements AuraInline {
        public final String text;

        public Text(String str) {
            C7384Etj.A0Y(str, 0);
            this.text = str;
        }

        public final Text copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Text(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Text) && C7384Etj.areEqual(this.text, ((Text) obj).text));
        }

        public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.text;
            }
            C7384Etj.A0Y(str, 0);
            return new Text(str);
        }

        public final String component1() {
            return this.text;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return C60O.A0r("Text(text=", this.text);
        }
    }
}
