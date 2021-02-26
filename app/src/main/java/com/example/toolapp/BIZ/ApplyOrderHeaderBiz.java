package com.example.toolapp.BIZ;

import java.math.BigDecimal;
import java.util.Date;

public class ApplyOrderHeaderBiz {
    private String	id;
    private int	version;
    private String created;
    private String	modified;
    private String	code;
    private int	serialNumber;
    private String	sourceOrderCode;
    private String	status;
    private int	cazeQty;
    private int	productTotal;
    private int	confirmCazeQty;
    private int	confirmProductTotal;
    private String	confirmDateTime;
    private String	confirmEmployeeId;
    private String	warehouseId;
    private String	reservationDeliveryTime;
    private String	confirmDeliveryDate	;
    private String	confirmDeliveryDateTimeRange;
    private String	fromBusinessUnitId;
    private String	productId;
    private String	productCode	;
    private String	productCarriageTime;
    private Integer	receivedQty;
    private String	differenceConfirmStatus;
    private String	qualityCheck;
    private String	qualityCheckDescription;
    private String	qualityCheckDateTime;
    private String	qualityCheckEmployeeId;
    private Integer	exceptionCazeQty;
    private String	operateSystemCode;
    private String	rejectReason	;
    private String	expressCompanyId;
    private String	waybillCode	;
    private String	createEmployeeId;
    private String	purchaseOrderId	;
    private String	purchaseOrderCode;
    private String	customFieldValue01;
    private String	customFieldValue02;
    private String	customFieldValue03;
    private String	customFieldValue04;
    private String	customFieldValue05;
    private String	scanType;
    private String	reservationDeliveryDateTimeRange;
    private String	lastApplyDate;
    private String	description	;
    private String	statusDescription;
    private String	statusCode;
    private String	warehouseCode;
    private String	warehouseName;
    private String	confirmEmployeeCode	;
    private String	confirmEmployeeName	;
    private String	fromBusinessUnitCode;
    private String	fromBusinessUnitName;
    private String	contractNumber;
    private String	productionOrderSourceOrderCode;
    private String	productDesignNo	;
    private String	inboundDifferenceConfirmStatus;
    private String	customPropertyValue01Code;
    private String	customPropertyValue01Name;
    private String	customPropertyValue02Code;
    private String	customPropertyValue02Name;
    private String	inboundDifferenceConfirmStatusDescription;
    private String	qualityCheckDesc	;
    private String	toWarehouseAddress	;
    private String	toWarehouseTel		;
    private String	toWarehouseContact	;
    private String	expressCompanyCode	;
    private String	expressCompanyName	;
    private String	createEmployeeCode	;
    private String	createEmployeeName	;
    private BigDecimal productionOrderQty;
    private String	deliveryDate;
    private String	qualityCheckEmployeeCode;
    private String	qualityCheckEmployeeName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSourceOrderCode() {
        return sourceOrderCode;
    }

    public void setSourceOrderCode(String sourceOrderCode) {
        this.sourceOrderCode = sourceOrderCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCazeQty() {
        return cazeQty;
    }

    public void setCazeQty(int cazeQty) {
        this.cazeQty = cazeQty;
    }

    public int getProductTotal() {
        return productTotal;
    }

    public void setProductTotal(int productTotal) {
        this.productTotal = productTotal;
    }

    public int getConfirmCazeQty() {
        return confirmCazeQty;
    }

    public void setConfirmCazeQty(int confirmCazeQty) {
        this.confirmCazeQty = confirmCazeQty;
    }

    public int getConfirmProductTotal() {
        return confirmProductTotal;
    }

    public void setConfirmProductTotal(int confirmProductTotal) {
        this.confirmProductTotal = confirmProductTotal;
    }

    public String getConfirmDateTime() {
        return confirmDateTime;
    }

    public void setConfirmDateTime(String confirmDateTime) {
        this.confirmDateTime = confirmDateTime;
    }

    public String getConfirmEmployeeId() {
        return confirmEmployeeId;
    }

    public void setConfirmEmployeeId(String confirmEmployeeId) {
        this.confirmEmployeeId = confirmEmployeeId;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getReservationDeliveryTime() {
        return reservationDeliveryTime;
    }

    public void setReservationDeliveryTime(String reservationDeliveryTime) {
        this.reservationDeliveryTime = reservationDeliveryTime;
    }

    public String getConfirmDeliveryDate() {
        return confirmDeliveryDate;
    }

    public void setConfirmDeliveryDate(String confirmDeliveryDate) {
        this.confirmDeliveryDate = confirmDeliveryDate;
    }

    public String getConfirmDeliveryDateTimeRange() {
        return confirmDeliveryDateTimeRange;
    }

    public void setConfirmDeliveryDateTimeRange(String confirmDeliveryDateTimeRange) {
        this.confirmDeliveryDateTimeRange = confirmDeliveryDateTimeRange;
    }

    public String getFromBusinessUnitId() {
        return fromBusinessUnitId;
    }

    public void setFromBusinessUnitId(String fromBusinessUnitId) {
        this.fromBusinessUnitId = fromBusinessUnitId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductCarriageTime() {
        return productCarriageTime;
    }

    public void setProductCarriageTime(String productCarriageTime) {
        this.productCarriageTime = productCarriageTime;
    }

    public Integer getReceivedQty() {
        return receivedQty;
    }

    public void setReceivedQty(Integer receivedQty) {
        this.receivedQty = receivedQty;
    }

    public String getDifferenceConfirmStatus() {
        return differenceConfirmStatus;
    }

    public void setDifferenceConfirmStatus(String differenceConfirmStatus) {
        this.differenceConfirmStatus = differenceConfirmStatus;
    }

    public String getQualityCheck() {
        return qualityCheck;
    }

    public void setQualityCheck(String qualityCheck) {
        this.qualityCheck = qualityCheck;
    }

    public String getQualityCheckDescription() {
        return qualityCheckDescription;
    }

    public void setQualityCheckDescription(String qualityCheckDescription) {
        this.qualityCheckDescription = qualityCheckDescription;
    }

    public String getQualityCheckDateTime() {
        return qualityCheckDateTime;
    }

    public void setQualityCheckDateTime(String qualityCheckDateTime) {
        this.qualityCheckDateTime = qualityCheckDateTime;
    }

    public String getQualityCheckEmployeeId() {
        return qualityCheckEmployeeId;
    }

    public void setQualityCheckEmployeeId(String qualityCheckEmployeeId) {
        this.qualityCheckEmployeeId = qualityCheckEmployeeId;
    }

    public Integer getExceptionCazeQty() {
        return exceptionCazeQty;
    }

    public void setExceptionCazeQty(Integer exceptionCazeQty) {
        this.exceptionCazeQty = exceptionCazeQty;
    }

    public String getOperateSystemCode() {
        return operateSystemCode;
    }

    public void setOperateSystemCode(String operateSystemCode) {
        this.operateSystemCode = operateSystemCode;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getExpressCompanyId() {
        return expressCompanyId;
    }

    public void setExpressCompanyId(String expressCompanyId) {
        this.expressCompanyId = expressCompanyId;
    }

    public String getWaybillCode() {
        return waybillCode;
    }

    public void setWaybillCode(String waybillCode) {
        this.waybillCode = waybillCode;
    }

    public String getCreateEmployeeId() {
        return createEmployeeId;
    }

    public void setCreateEmployeeId(String createEmployeeId) {
        this.createEmployeeId = createEmployeeId;
    }

    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getPurchaseOrderCode() {
        return purchaseOrderCode;
    }

    public void setPurchaseOrderCode(String purchaseOrderCode) {
        this.purchaseOrderCode = purchaseOrderCode;
    }

    public String getCustomFieldValue01() {
        return customFieldValue01;
    }

    public void setCustomFieldValue01(String customFieldValue01) {
        this.customFieldValue01 = customFieldValue01;
    }

    public String getCustomFieldValue02() {
        return customFieldValue02;
    }

    public void setCustomFieldValue02(String customFieldValue02) {
        this.customFieldValue02 = customFieldValue02;
    }

    public String getCustomFieldValue03() {
        return customFieldValue03;
    }

    public void setCustomFieldValue03(String customFieldValue03) {
        this.customFieldValue03 = customFieldValue03;
    }

    public String getCustomFieldValue04() {
        return customFieldValue04;
    }

    public void setCustomFieldValue04(String customFieldValue04) {
        this.customFieldValue04 = customFieldValue04;
    }

    public String getCustomFieldValue05() {
        return customFieldValue05;
    }

    public void setCustomFieldValue05(String customFieldValue05) {
        this.customFieldValue05 = customFieldValue05;
    }

    public String getScanType() {
        return scanType;
    }

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    public String getReservationDeliveryDateTimeRange() {
        return reservationDeliveryDateTimeRange;
    }

    public void setReservationDeliveryDateTimeRange(String reservationDeliveryDateTimeRange) {
        this.reservationDeliveryDateTimeRange = reservationDeliveryDateTimeRange;
    }

    public String getLastApplyDate() {
        return lastApplyDate;
    }

    public void setLastApplyDate(String lastApplyDate) {
        this.lastApplyDate = lastApplyDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getConfirmEmployeeCode() {
        return confirmEmployeeCode;
    }

    public void setConfirmEmployeeCode(String confirmEmployeeCode) {
        this.confirmEmployeeCode = confirmEmployeeCode;
    }

    public String getConfirmEmployeeName() {
        return confirmEmployeeName;
    }

    public void setConfirmEmployeeName(String confirmEmployeeName) {
        this.confirmEmployeeName = confirmEmployeeName;
    }

    public String getFromBusinessUnitCode() {
        return fromBusinessUnitCode;
    }

    public void setFromBusinessUnitCode(String fromBusinessUnitCode) {
        this.fromBusinessUnitCode = fromBusinessUnitCode;
    }

    public String getFromBusinessUnitName() {
        return fromBusinessUnitName;
    }

    public void setFromBusinessUnitName(String fromBusinessUnitName) {
        this.fromBusinessUnitName = fromBusinessUnitName;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getProductionOrderSourceOrderCode() {
        return productionOrderSourceOrderCode;
    }

    public void setProductionOrderSourceOrderCode(String productionOrderSourceOrderCode) {
        this.productionOrderSourceOrderCode = productionOrderSourceOrderCode;
    }

    public String getProductDesignNo() {
        return productDesignNo;
    }

    public void setProductDesignNo(String productDesignNo) {
        this.productDesignNo = productDesignNo;
    }

    public String getInboundDifferenceConfirmStatus() {
        return inboundDifferenceConfirmStatus;
    }

    public void setInboundDifferenceConfirmStatus(String inboundDifferenceConfirmStatus) {
        this.inboundDifferenceConfirmStatus = inboundDifferenceConfirmStatus;
    }

    public String getCustomPropertyValue01Code() {
        return customPropertyValue01Code;
    }

    public void setCustomPropertyValue01Code(String customPropertyValue01Code) {
        this.customPropertyValue01Code = customPropertyValue01Code;
    }

    public String getCustomPropertyValue01Name() {
        return customPropertyValue01Name;
    }

    public void setCustomPropertyValue01Name(String customPropertyValue01Name) {
        this.customPropertyValue01Name = customPropertyValue01Name;
    }

    public String getCustomPropertyValue02Code() {
        return customPropertyValue02Code;
    }

    public void setCustomPropertyValue02Code(String customPropertyValue02Code) {
        this.customPropertyValue02Code = customPropertyValue02Code;
    }

    public String getCustomPropertyValue02Name() {
        return customPropertyValue02Name;
    }

    public void setCustomPropertyValue02Name(String customPropertyValue02Name) {
        this.customPropertyValue02Name = customPropertyValue02Name;
    }

    public String getInboundDifferenceConfirmStatusDescription() {
        return inboundDifferenceConfirmStatusDescription;
    }

    public void setInboundDifferenceConfirmStatusDescription(String inboundDifferenceConfirmStatusDescription) {
        this.inboundDifferenceConfirmStatusDescription = inboundDifferenceConfirmStatusDescription;
    }

    public String getQualityCheckDesc() {
        return qualityCheckDesc;
    }

    public void setQualityCheckDesc(String qualityCheckDesc) {
        this.qualityCheckDesc = qualityCheckDesc;
    }

    public String getToWarehouseAddress() {
        return toWarehouseAddress;
    }

    public void setToWarehouseAddress(String toWarehouseAddress) {
        this.toWarehouseAddress = toWarehouseAddress;
    }

    public String getToWarehouseTel() {
        return toWarehouseTel;
    }

    public void setToWarehouseTel(String toWarehouseTel) {
        this.toWarehouseTel = toWarehouseTel;
    }

    public String getToWarehouseContact() {
        return toWarehouseContact;
    }

    public void setToWarehouseContact(String toWarehouseContact) {
        this.toWarehouseContact = toWarehouseContact;
    }

    public String getExpressCompanyCode() {
        return expressCompanyCode;
    }

    public void setExpressCompanyCode(String expressCompanyCode) {
        this.expressCompanyCode = expressCompanyCode;
    }

    public String getExpressCompanyName() {
        return expressCompanyName;
    }

    public void setExpressCompanyName(String expressCompanyName) {
        this.expressCompanyName = expressCompanyName;
    }

    public String getCreateEmployeeCode() {
        return createEmployeeCode;
    }

    public void setCreateEmployeeCode(String createEmployeeCode) {
        this.createEmployeeCode = createEmployeeCode;
    }

    public String getCreateEmployeeName() {
        return createEmployeeName;
    }

    public void setCreateEmployeeName(String createEmployeeName) {
        this.createEmployeeName = createEmployeeName;
    }

    public BigDecimal getProductionOrderQty() {
        return productionOrderQty;
    }

    public void setProductionOrderQty(BigDecimal productionOrderQty) {
        this.productionOrderQty = productionOrderQty;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getQualityCheckEmployeeCode() {
        return qualityCheckEmployeeCode;
    }

    public void setQualityCheckEmployeeCode(String qualityCheckEmployeeCode) {
        this.qualityCheckEmployeeCode = qualityCheckEmployeeCode;
    }

    public String getQualityCheckEmployeeName() {
        return qualityCheckEmployeeName;
    }

    public void setQualityCheckEmployeeName(String qualityCheckEmployeeName) {
        this.qualityCheckEmployeeName = qualityCheckEmployeeName;
    }
}
