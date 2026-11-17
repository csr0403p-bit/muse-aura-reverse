package com.facebook.rsys.ai.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60O;
import X.C8923Ftf;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes6.dex */
public class InputSchema {
    public static G50<InputSchema> CONVERTER = C8923Ftf.A00(8);
    public static long sMcfTypeId;
    public final String defaultValue;
    public final String description;
    public final ArrayList<String> enumValues;
    public final InputSchema items;
    public final ArrayList<InputSchema> oneOf;
    public final Map<String, InputSchema> properties;
    public final ArrayList<String> requiredProperties;
    public final int type;

    public class Builder {
        public String defaultValue;
        public String description;
        public ArrayList<String> enumValues;
        public InputSchema items;
        public ArrayList<InputSchema> oneOf;
        public Map<String, InputSchema> properties;
        public ArrayList<String> requiredProperties;
        public int type;

        public InputSchema build() {
            return new InputSchema(this);
        }
    }

    public static native InputSchema createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InputSchema) {
                InputSchema inputSchema = (InputSchema) obj;
                if (this.type == inputSchema.type && this.description.equals(inputSchema.description) && this.properties.equals(inputSchema.properties) && this.requiredProperties.equals(inputSchema.requiredProperties)) {
                    InputSchema inputSchema2 = this.items;
                    InputSchema inputSchema3 = inputSchema.items;
                    if (inputSchema2 != null ? inputSchema2.equals(inputSchema3) : inputSchema3 == null) {
                        ArrayList<String> arrayList = this.enumValues;
                        ArrayList<String> arrayList2 = inputSchema.enumValues;
                        if (arrayList == null) {
                            if (arrayList2 != null) {
                                return false;
                            }
                        } else if (arrayList.equals(arrayList2)) {
                        }
                        ArrayList<InputSchema> arrayList3 = this.oneOf;
                        ArrayList<InputSchema> arrayList4 = inputSchema.oneOf;
                        if (arrayList3 == null) {
                            if (arrayList4 != null) {
                                return false;
                            }
                        } else if (arrayList3.equals(arrayList4)) {
                        }
                        String str = this.defaultValue;
                        String str2 = inputSchema.defaultValue;
                        if (str == null) {
                            if (str2 != null) {
                                return false;
                            }
                        } else if (str.equals(str2)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0F(this.requiredProperties, (AnonymousClass005.A0I(this.description, (527 + this.type) * 31) + this.properties.hashCode()) * 31) + AnonymousClass006.A0D(this.items)) * 31) + AnonymousClass006.A0D(this.enumValues)) * 31) + AnonymousClass006.A0D(this.oneOf)) * 31) + AnonymousClass005.A0H(this.defaultValue);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("InputSchema{type=");
        sbA0x.append(this.type);
        sbA0x.append(",description=");
        sbA0x.append(this.description);
        sbA0x.append(",properties=");
        sbA0x.append(this.properties);
        sbA0x.append(",requiredProperties=");
        sbA0x.append(this.requiredProperties);
        sbA0x.append(",items=");
        sbA0x.append(this.items);
        sbA0x.append(",enumValues=");
        sbA0x.append(this.enumValues);
        sbA0x.append(",oneOf=");
        sbA0x.append(this.oneOf);
        sbA0x.append(",defaultValue=");
        return AbstractC7610F5x.A0w(this.defaultValue, sbA0x);
    }

    public InputSchema(Builder builder) {
        builder.description.getClass();
        builder.properties.getClass();
        builder.requiredProperties.getClass();
        this.type = builder.type;
        this.description = builder.description;
        this.properties = builder.properties;
        this.requiredProperties = builder.requiredProperties;
        this.items = builder.items;
        this.enumValues = builder.enumValues;
        this.oneOf = builder.oneOf;
        this.defaultValue = builder.defaultValue;
    }
}
