package ru.gpbf.middle.entity;

public record UserEntity(Long userTelegramId, String userName) {
    @Override
    public String toString() {
        return "UserEntity{" +
                "userTelegramId=" + userTelegramId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
