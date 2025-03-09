package com.imtiyaz.perday.expenses.transformer;

public interface Transformer <TEntity, TDto> {

    TEntity toEntity(TDto dto);

    TDto toDto(TEntity entity);

}