package com.facebook.aura.markdown.render;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes4.dex */
public final class AuraMarkdownInlineEntity {
    public static final int $stable = 0;
    public final String key;
    public final String text;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraMarkdownInlineEntity) {
                AuraMarkdownInlineEntity auraMarkdownInlineEntity = (AuraMarkdownInlineEntity) obj;
                if (!C7384Etj.areEqual(this.key, auraMarkdownInlineEntity.key) || !C7384Etj.areEqual(this.text, auraMarkdownInlineEntity.text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraMarkdownInlineEntity copy$default(AuraMarkdownInlineEntity auraMarkdownInlineEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = auraMarkdownInlineEntity.key;
        }
        if ((i & 2) != 0) {
            str2 = auraMarkdownInlineEntity.text;
        }
        AnonymousClass003.A0u(str, str2);
        return new AuraMarkdownInlineEntity(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.text;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.text, AnonymousClass001.A0G(this.key));
    }

    public String toString() {
        return FGI.A0h("AuraMarkdownInlineEntity(key=", this.key, ", text=", this.text, ")");
    }

    public AuraMarkdownInlineEntity(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.key = str;
        this.text = str2;
    }

    public final AuraMarkdownInlineEntity copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new AuraMarkdownInlineEntity(str, str2);
    }
}
