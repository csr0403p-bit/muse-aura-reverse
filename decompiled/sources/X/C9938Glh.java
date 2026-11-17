package X;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* renamed from: X.Glh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9938Glh extends C9917Gl8 {
    public static final long serialVersionUID = 1;
    public final C9933GlW _byEnumNamingResolver;
    public volatile C9933GlW _byIndexResolver;
    public final C9933GlW _byNameResolver;
    public volatile C9933GlW _byToStringResolver;
    public final Enum<?> _enumDefaultValue;
    public final C9934Glc _factory;

    public C9938Glh(C9934Glc c9934Glc, C9933GlW c9933GlW, C9933GlW c9933GlW2, C9933GlW c9933GlW3) {
        super(null, c9933GlW._enumClass, -1);
        this._byNameResolver = c9933GlW;
        this._factory = c9934Glc;
        this._enumDefaultValue = c9933GlW._defaultValue;
        this._byEnumNamingResolver = null;
        this._byToStringResolver = c9933GlW2;
        this._byIndexResolver = c9933GlW3;
    }
}
