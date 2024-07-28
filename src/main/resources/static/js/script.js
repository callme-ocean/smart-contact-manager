console.log("Script loaded");

// Start of change page theme
let currentTheme = getTheme();

document.addEventListener("DOMContentLoaded", () => {
    changeTheme();
});


function changeTheme() {
    changePageTheme(currentTheme, currentTheme);
    const changeThemeButton = document.querySelector("#theme_change_button");
    const oldTheme = currentTheme;

    // listener to change theme from button
    changeThemeButton.addEventListener("click", (event) => {
        let oldTheme = currentTheme;

        if (currentTheme == "dark") {
            currentTheme = "light";
        } else {
            currentTheme = "dark";
        }

        changePageTheme(currentTheme, oldTheme);
    });
}

// set theme to localStorage
function setTheme(theme) {
    localStorage.setItem("theme", theme);
}

function getTheme() {
    let theme = localStorage.getItem("theme");

    return theme ? theme : "light";
}

function changePageTheme(theme, oldTheme) {
    // update localStorage
    setTheme(currentTheme);

    // remove current theme
    document.querySelector('html').classList.remove(oldTheme);

    // set new theme
    document.querySelector('html').classList.add(theme);

    // change text of button
    document.querySelector("#theme_change_button").querySelector("span").textContent = theme == "light" ? "Dark" : "Light";
}
// End of change page theme