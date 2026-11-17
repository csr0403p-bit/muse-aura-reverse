package com.meta.maps.core;

/* loaded from: classes4.dex */
public interface Analytics extends Providing {
    DeviceInfo getDeviceInfo();

    String getExperimentTag();

    String getMapSessionId();

    ProductSurface getProductSurface();

    String getTempPath();

    String getVersion();

    void setDeviceInfo(DeviceInfo deviceInfo);

    void setExperimentTag(String str);

    void setProductSurface(ProductSurface productSurface);

    void setVersion(String str);
}
